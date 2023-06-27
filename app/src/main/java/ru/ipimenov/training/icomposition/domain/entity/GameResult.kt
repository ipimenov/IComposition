package ru.ipimenov.training.icomposition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
) : Parcelable