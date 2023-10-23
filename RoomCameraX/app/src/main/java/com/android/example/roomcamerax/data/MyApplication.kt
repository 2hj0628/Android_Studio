package com.android.example.roomcamerax.data

import android.app.Application
import androidx.room.Room

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        ).build()
    }
}