package pl.bk20.forest.stats.domain.usecase

import pl.bk20.forest.core.domain.repository.DayRepository

class StatsChartUseCases(
    dayRepository: DayRepository
) {

    val getWeek: GetWeek = GetWeekImpl(dayRepository)
    val getFirstDate: GetFirstDate = GetFirstDateImpl(dayRepository)
}