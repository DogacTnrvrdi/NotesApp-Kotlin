package com.dogactnrvrdi.notesapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dogactnrvrdi.notesapp.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun getNoteDao(): INoteDao
}