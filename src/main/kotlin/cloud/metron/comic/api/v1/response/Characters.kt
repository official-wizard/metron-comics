package cloud.metron.comic.api.v1.response

data class Characters(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Character>
) {
    data class Character(
        val id: Int,
        val name: String,
        val modified: String
    )
}