package com.example.tiktaktuk

import android.media.AsyncPlayer
import kotlin.random.Random

data class GameModel (
    var gameId : String = "-1",
    var filledpos : MutableList<String> = mutableListOf("","","","","","","","",""),
    var winner : String = "",
    var gameStatus : GameStatus = GameStatus.CREATED,
    var currentPlayer: String = (arrayOf("X","O"))[Random.nextInt(2)]
)

enum class GameStatus{
    CREATED,
    JOINED,
    INPROGRESS,
    FINISHED
}