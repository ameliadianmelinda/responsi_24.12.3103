package com.example.responsi

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class AddNoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        val etTitle = findViewById<EditText>(R.id.etTitle)
        val etContent = findViewById<EditText>(R.id.etContent)
        val rgPriority = findViewById<RadioGroup>(R.id.rgPriority)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            val title = etTitle.text.toString()
            val content = etContent.text.toString()
            val selectedId = rgPriority.checkedRadioButtonId
            val priority = when (selectedId) {
                R.id.rbHigh -> "Penting"
                R.id.rbNormal -> "Normal"
                R.id.rbLow -> "Rendah"
                else -> "Normal"
            }

            if (title.isNotEmpty() && content.isNotEmpty()) {
                NoteRepository.notes.add(Note(title, content, priority))
                Toast.makeText(this, "Catatan ditambahkan", Toast.LENGTH_SHORT).show()
                finish() // kembali ke HomeFragment
            } else {
                Toast.makeText(this, "Semua field harus diisi!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
