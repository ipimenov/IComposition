package ru.ipimenov.training.icomposition.domain.repository

import ru.ipimenov.training.icomposition.domain.entity.GameSettings
import ru.ipimenov.training.icomposition.domain.entity.Level
import ru.ipimenov.training.icomposition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question
    fun getGameSettings(level: Level): GameSettings
}