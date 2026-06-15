package com.ccvgames.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "matches")
data class Match(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val championshipId: Int,
    val player1Id: Int,
    val player2Id: Int,
    val player1Name: String,
    val player2Name: String,
    val player1Score: Int = 0,
    val player2Score: Int = 0,
    val winnerId: Int? = null,
    val status: String = "PENDING",
    val createdAt: Long = System.currentTimeMillis()
)
