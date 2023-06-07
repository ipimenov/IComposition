package ru.ipimenov.training.icomposition.domain.usecases

import ru.ipimenov.training.icomposition.domain.entity.GameSettings
import ru.ipimenov.training.icomposition.domain.entity.Level
import ru.ipimenov.training.icomposition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}