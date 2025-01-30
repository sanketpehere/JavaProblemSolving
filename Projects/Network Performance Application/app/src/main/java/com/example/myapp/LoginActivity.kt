//package com.example.myapp
//import android.util.Log
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import com.google.firebase.auth.FirebaseAuth
//
////
////class LoginActivity : AppCompatActivity() {
////
////    private lateinit var auth: FirebaseAuth
////    private lateinit var editTextEmail: EditText
////    private lateinit var editTextPassword: EditText
////    private lateinit var buttonLogin: Button
////
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_login)
////
////        auth = FirebaseAuth.getInstance()
////
////        editTextEmail = findViewById(R.id.editTextEmail)
////        editTextPassword = findViewById(R.id.editTextPassword)
////        buttonLogin = findViewById(R.id.buttonLogin)
////
////        buttonLogin.setOnClickListener { loginUser() }
////    }
////
////    private fun loginUser() {
////        val email = editTextEmail.text.toString()
////        val password = editTextPassword.text.toString()
////
////        auth.signInWithEmailAndPassword(email, password)
////            .addOnCompleteListener(this) { task ->
////                if (task.isSuccessful) {
////                    Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
////                    startActivity(Intent(this, NetworkInfoActivity::class.java))
////                    finish()
////                } else {
////                    Toast.makeText(this, "Login failed: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
////                }
////            }
////    }
////}
//
//
//class LoginActivity : AppCompatActivity() {
//
//    private lateinit var auth: FirebaseAuth
//    private lateinit var editTextEmail: EditText
//    private lateinit var editTextPassword: EditText
//    private lateinit var buttonLogin: Button
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
//
//        auth = FirebaseAuth.getInstance()
//
//        editTextEmail = findViewById(R.id.editTextEmail)
//        editTextPassword = findViewById(R.id.editTextPassword)
//        buttonLogin = findViewById(R.id.buttonLogin)
//
//        buttonLogin.setOnClickListener { loginUser() }
//    }
//
//    private fun loginUser() {
//        val email = editTextEmail.text.toString()
//        val password = editTextPassword.text.toString()
//
//        if (email.isEmpty() || password.isEmpty()) {
//            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
//            return
//        }
//
//        auth.signInWithEmailAndPassword(email, password)
//            .addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {
//                    // Confirm the login is successful and navigation is triggered
//                    Log.d("LoginActivity", "Login successful. Navigating to NetworkInfoActivity")
//                    Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
//                    startActivity(Intent(this, NetworkInfoActivity::class.java))
//                    finish()  // Finish LoginActivity so user can't go back to it
//                } else {
//                    val errorMessage = task.exception?.message
//                    Toast.makeText(this, "Login failed: $errorMessage", Toast.LENGTH_SHORT).show()
//                    Log.e("LoginActivity", "Login failed: $errorMessage")
//                }
//            }
//    }
//}

package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener { loginUser() }
    }

    private fun loginUser() {
        val email = editTextEmail.text.toString().trim()
        val password = editTextPassword.text.toString().trim()

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            return
        }

        Log.d("LoginActivity", "Attempting to log in with email: $email")  // Log email for debugging

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Log.d("LoginActivity", "Login successful. Navigating to NetworkInfoActivity")
                    Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, NetworkInfoActivity::class.java))
                    finish()
                } else {
                    val errorMessage = task.exception?.message ?: "Unknown error"
                    Toast.makeText(this, "Login failed: $errorMessage", Toast.LENGTH_SHORT).show()
                    Log.e("LoginActivity", "Login failed: $errorMessage")
                }
            }
    }
}
