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
}