package pl.edu.uj.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.app.Activity
import java.util.*
import java.util.TimerTask as TimerTask


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                1 -> {
                    val labelka = findViewById<TextView>(R.id.labelka)
                    labelka.text = data?.getStringExtra("result") ?: "Nie bangla!!!"
                }
            }
        }

        super.onActivityResult(requestCode, resultCode, data)
    }


    fun buttonClick(view: View) {
        val labelka = findViewById<TextView>(R.id.labelka)
        labelka.text = "Kurs Android"
        val intent = Intent(this, ThirdActivity::class.java).apply {
            putExtra("message",labelka.text)
        }
        startActivityForResult(intent, 1)

    }
}

