package com.spconnect.application

import android.app.Activity
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
        layout.setPadding(32, 40, 32, 40)

        val title = TextView(this)
        title.text = "Inscription Élève"
        title.textSize = 28f
        title.setTextColor(Color.BLACK)
        title.gravity = Gravity.CENTER
        title.setPadding(0, 0, 0, 24)

        layout.addView(title)

        val nom = champ("Nom")
        val prenom = champ("Prénom")
        val telephone = champ("Téléphone")
        val email = champ("Adresse e-mail")
        val etablissement = champ("Établissement")
        val classe = champ("Classe / Niveau")
        val matieres = champ("Matières demandées")
        val adresse = champ("Adresse de résidence")

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

            if (
                nom.text.toString().isBlank() ||
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
                    "Informations enregistrées. Étape suivante.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        setContentView(layout)
    }

    private fun champ(indication: String): EditText {
        val champ = EditText(this)

        champ.hint = indication
        champ.textSize = 16f
        champ.setSingleLine(true)

        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        params.setMargins(0, 6, 0, 6)

        champ.layoutParams = params

        return champ
    }
}
