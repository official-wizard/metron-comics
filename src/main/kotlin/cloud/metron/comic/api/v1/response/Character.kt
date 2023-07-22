package cloud.metron.comic.api.v1.response


data class Character (
    val id: Int,
    val name: String,
    val alias: List<String>?,
    val desc: String,
    val image: String,
    val creators: List<Creator>,
    val teams: List<Team>,
    val cv_id: Int,
    val resource_url: String,
    val modified: String
) {
    data class Creator(
        val id: Int,
        val name: String,
        val modified: String
    )

    data class Team(
        val id: Int,
        val name: String,
        val modified: String
    )
}