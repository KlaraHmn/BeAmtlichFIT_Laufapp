package pl.bk20.forest.domain.usecase

import kotlinx.coroutines.flow.Flow
import pl.bk20.forest.domain.repository.DayRepository

interface GetTreeCount {
    operator fun invoke(): Flow<Int>
}

class GetTreeCountImpl(
    private val dayRepository: DayRepository
) : GetTreeCount {

    override fun invoke(): Flow<Int> {
        return dayRepository.getTreeCount()
    }
}