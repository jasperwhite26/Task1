enum class DayPart{
    MORNING, AFTERNOON, EVENING,
}
data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: String,
    val durationInMinutes: Int,

)

fun main(){
    val event1 = Event(
        "Party",
        "Halloween",
        "Evening",
        180
    )

    val event2 = Event(
        "Wedding",
        "Marriage",
        "Afternoon",
        60
    )

    val event3 = Event(
        "Funeral",
        "Death",
        "Morning",
        120
    )
}