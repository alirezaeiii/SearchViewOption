package com.example.myapplication

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val options = ActivityOptions.makeSceneTransitionAnimation(
                this,
                button,"animation"
            ).toBundle()

            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent, options)
        }
    }
}