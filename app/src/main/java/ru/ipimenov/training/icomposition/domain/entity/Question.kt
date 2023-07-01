package ru.ipimenov.training.icomposition.domain.entity

data class Question(
    val sum: Int,
    val visibleNumber: Int,
    val options: List<Int>
) {
    val rigtAnswer: Int
        get() = sum - visibleNumber
}