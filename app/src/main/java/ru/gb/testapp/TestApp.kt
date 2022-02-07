package ru.gb.testapp


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TestApp : AppCompatActivity() {


    private lateinit var changeButton:Button

    data class Client(val name: String, var postalCode: Int)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.text_view)
        var nameView = findViewById<TextView>(R.id.call_my_name_view)
        changeButton = findViewById(R.id.change_button)

        changeButton.setOnClickListener {
            textView.text = "Hello World!"
            nameView.text = Client("Имя_Фамилия", 35016625).toString()

        }


        val c1 = Client("Говард Филлипс Лавкрафт",3313311)
        val c2 = c1.copy(name  = "Айзек Азимов", 2210211)
        println(c1)
        println(c2)
    }


}