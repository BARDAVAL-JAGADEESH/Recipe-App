package com.bardaval.recipesapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Use android.os.Handler
        val handler = Handler(Looper.getMainLooper())
        // Now you can use the handler for tasks like posting delayed runnables
        handler.postDelayed({
            // Create an Intent to start the new activity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            // Optionally finish the current activity if you don't want it in the back stack
            finish()
        }, 2000) // 2000 milliseconds = 2 seconds
    }
}
