package pl.bk20.forest.data.source

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import pl.bk20.forest.domain.model.Day
import pl.bk20.forest.domain.model.DayParameters
import java.time.LocalDate

@Dao
interface DayDao {

    @Query("SELECT COUNT(*) FROM day WHERE steps >= goal")
    fun getTreeCount(): Flow<Int>

    @Query("SELECT * FROM day ORDER BY date ASC LIMIT 1")
    fun getFirstDay(): Flow<Day?>

    @Query("SELECT * FROM day WHERE date = :date")
    fun getDay(date: LocalDate): Flow<Day?>

    @Query("SELECT * FROM day WHERE date BETWEEN :start AND :endInclusive")
    fun getDays(start: LocalDate, endInclusive: LocalDate): Flow<List<Day>>

    @Upsert
    suspend fun upsertDay(day: Day)

    @Update(entity = Day::class)
    suspend fun updateParameters(day: DayParameters)
}