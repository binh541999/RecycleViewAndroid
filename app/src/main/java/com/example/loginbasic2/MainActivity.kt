package com.example.loginbasic2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private  var username:String = ""
    private  var password:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        renderUI()

    }
    private fun renderUI(){
        val etUsername = findViewById<EditText>(R.id.et_username)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val login = findViewById<Button>(R.id.btn_login)

        etUsername.afterTextChanged { reserve ->
            if(reserve.toString().contains('a'))
                Toast.makeText(
                    applicationContext,
                    "Inavlid Character",
                    Toast.LENGTH_LONG
                ).show()
            username=reserve.toString()
        }
        etPassword.afterTextChanged { reserve ->
            password=reserve.toString()
        }

        login.setOnClickListener {

            var intent=Intent(baseContext,SecondScreen::class.java)
            startActivity(intent)
        }

    }



}
fun EditText.afterTextChanged(afterTextChanged: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(editable: Editable?) {
            afterTextChanged.invoke(editable.toString())
        }

        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
    })
}