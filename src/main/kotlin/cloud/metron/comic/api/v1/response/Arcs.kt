package cloud.metron.comic.api.v1.response

class Arcs(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Creators.Creator>) {

    data class Arc(
        val id: Int,
        val name: String,
        val modified: String,
    )
}