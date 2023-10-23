package com.android.example.roomcamerax.data

import android.content.Context
import androidx.room.Room

class MyRepository(private val context: Context) {

    private val db = Room.databaseBuilder(
        context.applicationContext,
        AppDatabase::class.java, "database-name"
    ).build()

    fun getUsers(): List<User> {
        val userDao = db.userDao()
        return userDao.getAll()
    }
}