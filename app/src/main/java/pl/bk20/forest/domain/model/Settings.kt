package pl.bk20.forest.domain.model

data class Settings(
    val dailyGoal: Int,
    val stepLength: Int,
    val height: Int,
    val weight: Int,
    val pace: Float
)