package com.example.loginprueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var imgHamburguesa: ImageView
    private lateinit var imgPizza: ImageView
    private lateinit var imgBebida: ImageView
    private lateinit var imgSnack: ImageView

    private lateinit var imgSignOut: ImageView

    private lateinit var btnOrdenes: Button

    private lateinit var card: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrdenes = findViewById(R.id.btnOrdenes)


        imgHamburguesa = findViewById(R.id.imgHamburguesa)
        imgPizza  = findViewById(R.id.imgPizza)
        imgBebida  = findViewById(R.id.imgFrape)
        imgSnack  = findViewById(R.id.imgPapas)
        imgSignOut = findViewById(R.id.signOut)

        //card = findViewById(R.id.recyclercardH)

        //card.layoutManager = LinearLayoutManager(this)

        //card.setHasFixedSize(true)

        imgHamburguesa.setOnClickListener {
            Toast.makeText(this, "Elegiste categoria hamburguesa", Toast.LENGTH_LONG).show()

        }

        imgPizza.setOnClickListener {
            Toast.makeText(this, "Elegiste categoria pizza", Toast.LENGTH_LONG).show()

        }

        imgBebida.setOnClickListener {
            Toast.makeText(this, "Elegiste categoria bebida", Toast.LENGTH_LONG).show()

        }

        imgSnack.setOnClickListener {
            Toast.makeText(this, "Elegiste categoria snack", Toast.LENGTH_LONG).show()

        }

        btnOrdenes.setOnClickListener {
            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
        }

        imgSignOut.setOnClickListener {
            FirebaseAuth.getInstance().signOut()

            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)

        }




    }

}
