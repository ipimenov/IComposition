package ru.ipimenov.training.icomposition.domain.usecases

import ru.ipimenov.training.icomposition.domain.entity.Question
import ru.ipimenov.training.icomposition.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}