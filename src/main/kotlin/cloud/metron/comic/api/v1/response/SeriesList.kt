package cloud.metron.comic.api.v1.response

data class SeriesList (
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Series>
) {
    data class Series(
        val id: Int,
        val series: String,
        val year_began: Int,
        val issue_count: Int,
        val modified: String
    )
}