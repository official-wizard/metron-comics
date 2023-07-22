package cloud.metron.comic.api.v1.response

class Creators(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Creator>) {

    data class Creator(
        val id: Int,
        val name: String,
        val modified: String,
    )
}