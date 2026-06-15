package com.ccvgames.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "championships")
data class Championship(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val phase: String,
    val status: String = "ACTIVE",
    val createdAt: Long = System.currentTimeMillis()
)
