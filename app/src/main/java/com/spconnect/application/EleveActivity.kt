package com.spconnect.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class EleveActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(35, 40, 32, 40)

        val title = TextView(this)
        title.text = "Inscription Eleve"
        title.textSize = 28f
        title.setTextColor(Color.BLACK)
        title.gravity = Gravity.CENTER
        title.setPadding(0, 0, 0, 24)

        layout.addView(title)

        val nom = champ("Nom")
        val prenom = champ("Prenom")
        val telephone = champ("Telephone")
        val email = champ("Adresse e-mail")
        val etablissement = champ("Etablissement")
        val classe = champ("Classe / Niveau")
        val matieres = champ("Matieres demandees")
        val adresse = champ("Adresse de residence")

        layout.addView(nom)
        layout.addView(prenom)
        layout.addView(telephone)
        layout.addView(email)
        layout.addView(etablissement)
        layout.addView(classe)
        layout.addView(matieres)
        layout.addView(adresse)

        val continuer = Button(this)
        continuer.text = "Continuer"

        val buttonParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        buttonParams.setMargins(0, 24, 0, 0)

        layout.addView(continuer, buttonParams)

        continuer.setOnClickListener {
            if (nom.text.toString().isBlank() ||
                prenom.text.toString().isBlank() ||
                telephone.text.toString().isBlank() ||
                classe.text.toString().isBlank()
            ) {
                Toast.makeText(
                    this,
                    "Veuillez remplir les informations obligatoires.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this,
                    "Informations enregistrees. Etape suivante.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        // BOUTON POUR ALLER AU PAIEMENT
        val btnPaiement = Button(this)
        btnPaiement.text = "Aller au Paiement"
        
        val btnParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        btnParams.setMargins(0, 24, 0, 0)
        
        layout.addView(btnPaiement, btnParams)
        
        btnPaiement.setOnClickListener {
            val intent = Intent(this, PaiementActivity::class.java)
            startActivity(intent)
        }

        setContentView(layout)
    }

    private fun champ(label: String): EditText {
        val editText = EditText(this)
        editText.hint = label
        editText.setPadding(0, 0, 0, 16)
        return editText
    }
}
