package com.example.tanjuldiz.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Qosiqlar")
data class TanJuldizi(
    @PrimaryKey
    val id:Int,
    @ColumnInfo (name = "name")
    val name:String,
    @ColumnInfo (name = "text")
    val text:String,
    @ColumnInfo (name = "is-Favorite")
    var isFavorite:Int,
    @ColumnInfo (name = "department-id")
    var departmentId:Int,
    @ColumnInfo(name = "categoryid-id")
    var categoryidId:Int
)
