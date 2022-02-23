package com.keecoding.baseapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    companion object {
        const val TAG = "App_db"
    }
    // Put your DAO here
}