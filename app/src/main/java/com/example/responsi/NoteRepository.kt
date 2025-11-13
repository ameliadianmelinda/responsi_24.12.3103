package com.example.responsi

object NoteRepository {
    // ArrayList statis untuk menyimpan semua catatan
    val notes = ArrayList<Note>()

    // Opsional: bisa langsung kasih beberapa default note
    init {
        notes.add(Note("Belajar Kotlin", "Pelajari class, object, dan function", "Tinggi"))
        notes.add(Note("Belajar Android", "Buat aplikasi sederhana dengan RecyclerView", "Sedang"))
    }
}
