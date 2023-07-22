package cloud.metron.comic.api.v1.response

data class Issue (
    val id: Int,
    val publisher: Publisher,
    val series: Series,
    val number: String,
    val title: String,
    val name: List<String>?,
    val cover_date: String,
    val store_date: String?,
    val price: String?,
    val rating: Rating,
    val sku: String,
    val isbn: String,
    val upc: String,
    val page: Int?,
    val desc: String,
    val image: String,
    val cover_hash: String,
    val arcs: List<Arc>,
    val credits: List<Credit>,
    val characters: List<Character>,
    val teams: List<Team>,
    val reprints: List<Reprint>,
    val variants: List<Variant>,
    val cv_id: Int?,
    val resource_url: String,
    val modified: String
    ) {

    data class Variant(
        val name: String,
        val sku: String,
        val upc: String,
        val image: String
    )

    data class Reprint(
        val id: Int,
        val issue: String
    )

    data class Team(
        val id: Int,
        val name: String,
        val modified: String
    )

    data class Character(
        val id: Int,
        val name: String,
        val modified: String
    )

    data class Credit(
        val id: Int,
        val creator: String,
        val role: List<Role>
    ) {
        data class Role(
            val id: Int,
            val name: String
        )
    }

    data class Arc (
        val id: Int,
        val name: String,
        val modified: String
    )

    data class Rating (
        val id: Int,
        val name: String
    )

    data class Publisher(
        val id: Int,
        val name: String
    )

    data class Series(
        val id: Int,
        val name: String,
        val sort_name: String,
        val volume: Int,
        val series_type: Type,
        val genres: List<Genre>,
    ) {
        data class Genre(
            val id: Int,
            val name: String
        )
        data class Type (
            val id: Int,
            val name: String
        )
    }
}