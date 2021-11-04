package pl.edu.uj.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.content.Intent

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        var message = intent.getStringExtra("message")
        val labelka = findViewById<TextView>(R.id.textview2)
        labelka.text = message
    }

    fun backClick(view: View) {
        val returnIntent = Intent()
        returnIntent.putExtra("result", "Bangla!")
        setResult(RESULT_OK, returnIntent)
        finish()
    }
}