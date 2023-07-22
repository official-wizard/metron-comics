package cloud.metron.comic.api.v1.response

data class Issues(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Issue>
) {
    data class Issue(
        val id: Int,
        val series: Series,
        val number: String,
        val issue: String,
        val cover_date: String,
        val image: String,
        val cover_hash: String,
        val modified: String,
    ) {
        data class Series(
            val name: String,
            val volume: Int,
            val year_began: Int
        )
    }
}