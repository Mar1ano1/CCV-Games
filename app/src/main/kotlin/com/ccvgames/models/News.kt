package com.ccvgames.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "news")
data class News(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val content: String,
    val type: String = "INFO",
    val createdAt: Long = System.currentTimeMillis()
)
