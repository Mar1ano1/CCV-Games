package com.ccvgames.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "players")
data class Player(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val email: String,
    val password: String,
    val name: String,
    val country: String,
    val club: String,
    val ranking: String = "B",
    val points: Int = 0,
    val wins: Int = 0,
    val losses: Int = 0,
    val createdAt: Long = System.currentTimeMillis()
)
