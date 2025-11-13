package com.example.responsi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val toolbar = findViewById<Toolbar>(R.id.toolbarDetail)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Detail Catatan"

        val title = intent.getStringExtra("title")
        val content = intent.getStringExtra("content")
        val priority = intent.getStringExtra("priority")

        val tvTitleDetail = findViewById<TextView>(R.id.tvTitleDetail)
        val tvContentDetail = findViewById<TextView>(R.id.tvContentDetail)
        val tvPriorityDetail = findViewById<TextView>(R.id.tvPriorityDetail)

        tvTitleDetail.text = title
        tvContentDetail.text = content
        tvPriorityDetail.text = "Prioritas: $priority"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}
