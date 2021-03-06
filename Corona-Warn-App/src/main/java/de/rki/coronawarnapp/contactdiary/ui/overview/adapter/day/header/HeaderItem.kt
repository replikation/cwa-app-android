package de.rki.coronawarnapp.contactdiary.ui.overview.adapter.day.header

import de.rki.coronawarnapp.contactdiary.ui.overview.adapter.day.DayDataItem
import org.joda.time.LocalDate

data class HeaderItem(
    val date: LocalDate
) : DayDataItem {
    override val stableId: Long = date.hashCode().toLong()
}
