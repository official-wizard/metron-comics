package cloud.metron.comic.api.v1.response

data class IssueList(
    val id: Int,
    val series: Series,
    val number: String,
    val issue: String,
    val cover_date: String,
    val image: String,
    val cover_hash: String,
    val modified: String
) {
    data class Series(
        val name: String,
        val volume: String,
        val year_began: String
    )
}