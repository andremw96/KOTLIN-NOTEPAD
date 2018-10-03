package com.udacity.notepad

import com.udacity.notepad.data.Note

fun demoDataClasses()
{
    val note = Note(text = "This is a note")
    note == note.copy() // this is true

    val aCopy = note.copy(text = "something else...")
}