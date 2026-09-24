package com.spconnect.application

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(32, 40, 32, 40)

        val title = TextView(this)
        title.text = "SP Connect"
        title.textSize = 32f
        title.setTextColor(Color.BLACK)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Cours à domicile, simplement."
        subtitle.textSize = 18f
        subtitle.setTextColor(Color.DKGRAY)
        subtitle.gravity = Gravity.CENTER
        subtitle.setPadding(0, 12, 0, 32)

        layout.addView(title)
        layout.addView(subtitle)

        ajouterBouton(layout, "Élève")
        ajouterBouton(layout, "Parent")
        ajouterBouton(layout, "Élève-professeur")
        ajouterBouton(layout, "Professeur titulaire")
        ajouterBouton(layout, "École / Université")
        ajouterBouton(layout, "Commercial")
        ajouterBouton(layout, "Administration")

        setContentView(layout)
    }

    private fun ajouterBouton(
        layout: LinearLayout,
        texte: String
    ) {
        val bouton = Button(this)
        bouton.text = texte

        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        params.setMargins(0, 8, 0, 8)

        layout.addView(bouton, params)

        bouton.setOnClickListener {
            Toast.makeText(
                this,
                "Ouverture de l'espace : $texte",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
