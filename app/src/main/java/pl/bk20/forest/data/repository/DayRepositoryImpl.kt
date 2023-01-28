package pl.bk20.forest.data.repository

import kotlinx.coroutines.flow.Flow
import pl.bk20.forest.data.source.DayDao
import pl.bk20.forest.domain.model.Day
import pl.bk20.forest.domain.repository.DayRepository
import java.time.LocalDate

class DayRepositoryImpl(
    private val dao: DayDao
) : DayRepository {

    override fun getDay(date: LocalDate): Flow<Day?> {
        return dao.getDay(date)
    }

    override suspend fun insertDay(day: Day) {
        dao.insertDay(day)
    }
}