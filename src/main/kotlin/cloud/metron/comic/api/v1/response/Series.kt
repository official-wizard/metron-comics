package cloud.metron.comic.api.v1.response

data class Series (
    val id: Int,
    val name: String,
    val sort_name: String,
    val volume: Int,
    val series_type: Type,
    val publisher: Publisher,
    val year_began: Int,
    val year_end: Int?,
    val desc: String,
    val issue_count: Int,
    val genres: List<Genre>,
    val associated: List<Associated>,
    val cv_id: Int,
    val resource_url: String,
    val modified: String

) {
    data class Associated(
        val id: Int,
        val series: String
    )

    data class Genre(
        val id: Int,
        val name: String
    )

    data class Publisher(
        val id: Int,
        val name: String
    )

    data class Type (
        val id: Int,
        val name: String
    )
}
