package cloud.metron.comic.api.v1.response

data class Publisher (
    val id: Int,
    val name: String,
    val founded: Int?,
    val desc: String,
    val image: String,
    val cv_id: Int?,
    val resource_url: String,
    val modified: String
)