package cloud.metron.comic.api.v1.response

data class Roles (
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Role>
) {
    data class Role(
        val id: Int,
        val name: String
    )
}