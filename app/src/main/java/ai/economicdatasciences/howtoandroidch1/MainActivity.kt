package ai.economicdatasciences.howtoandroidch1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.enter_button)?.setOnClickListener {
            // get the greeting display text
            val greetingDisplay = findViewById<TextView>(R.id.greeting_display)
            // get the first name TextInputEditText value
            val firstName = findViewById<TextInputEditText>(R.id.first_name)?.text.toString().trim()
            // get the last name
            val lastName = findViewById<TextInputEditText>(R.id.last_name)?.text.toString().trim()
            // checking name is not empty
            if(firstName.isNotEmpty() && lastName.isNotEmpty()){
                val nameToDisplay = firstName.plus(" ").plus(lastName)
                // string template to display
                greetingDisplay?.text = " ${getString(R.string.welcome_to_the_app)} ${nameToDisplay}!"
            } else {
                Toast.makeText(this, getString(R.string.please_enter_a_name), Toast.LENGTH_LONG).apply {
                    setGravity(Gravity.CENTER, 0, 0)
                    show()
                }
            }
        }
    }
}