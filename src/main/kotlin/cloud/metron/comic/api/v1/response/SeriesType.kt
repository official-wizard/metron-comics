package cloud.metron.comic.api.v1.response

data class SeriesType (
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Type>
) {
    data class Type (
        val id: Int,
        val name: String
    )
}