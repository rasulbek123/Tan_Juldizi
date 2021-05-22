package com.example.tanjuldiz.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.tanjuldiz.data.model.TanJuldizi

@Dao
interface TanJuldiziDao {
    @Query("SELECT * FROM Qosiqlar")
    fun getAll():List<TanJuldizi>
}