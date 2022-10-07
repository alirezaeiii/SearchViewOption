package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity

class SearchActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val button = findViewById<Button>(R.id.button)
        val search = findViewById<SearchView>(R.id.search)

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return true
            }

            override fun onQueryTextChange(query: String): Boolean {
                if (query.isNotEmpty()) {
                    button.visibility = View.GONE
                } else {
                    button.visibility = View.VISIBLE
                }
                return true
            }
        })
    }
}