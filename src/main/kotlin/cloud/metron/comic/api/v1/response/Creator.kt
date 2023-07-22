package cloud.metron.comic.api.v1.response

data class Creator (
    val id: Int,
    val name: String,
    val birth: String?,
    val death: String?,
    val desc: String,
    val image: String,
    val alias: List<String>?,
    val cv_id: Int,
    val resource_url: String,
    val modified: String
)