package com.example.tanjuldiz.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tanjuldiz.data.dao.TanJuldiziDao
import com.example.tanjuldiz.data.model.TanJuldizi

@Database(entities = [TanJuldizi::class],version = 1)
abstract class TanJuldiziDataBase:RoomDatabase() {
    companion object{
        private lateinit var INSTANCE:TanJuldiziDataBase
        fun getInstance(context: Context) :RoomDatabase =
            Room.databaseBuilder(
                context,
                TanJuldiziDataBase::class.java,
                "Tan_Juldiz"
            )   .allowMainThreadQueries()
                .createFromAsset("Tan_Juldiz")
                .build()
    }
    abstract fun dao():TanJuldiziDao
}