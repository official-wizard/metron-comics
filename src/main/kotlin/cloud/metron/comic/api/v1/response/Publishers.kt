package cloud.metron.comic.api.v1.response

data class Publishers (
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Publisher>) {

    data class Publisher(
        val id: Int,
        val name: String,
        val modified: String,
    )
}