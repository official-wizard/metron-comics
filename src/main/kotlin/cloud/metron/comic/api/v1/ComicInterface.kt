package cloud.metron.comic.api.v1

import cloud.metron.comic.api.v1.response.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ComicInterface {

    /**
     * list: Returns a list of all the story arcs.
     */
    @GET("arc/")
    fun getArcs(
        @Query("cv_id") cv_id: Int? = null,
        @Query("modified_gt") modified_gt: String? = null,
        @Query("name") name: String? = null,
        @Query("page") page: Int? = null
    ): Call<Arcs>

    /**
     * retrieve: Returns the information of an individual story arc.
     */
    @GET("arc/{id}/")
    fun getArc(
        @Path("id") id: Int
    ): Call<Arc>

    /**
     * Returns a list of issues for a story arc.
     */
    @GET("arc/{id}/issue_list/")
    fun getArcIssueLists(
        @Path("id") id: Int
    ): Call<IssueList>

    /**
     * list: Return a list of all the characters.
     */
    @GET("character/")
    fun getCharacters(
        @Query("cv_id") cv_id: Int? = null,
        @Query("modified_gt") modified_gt: String? = null,
        @Query("name") name: String? = null,
        @Query("page") page: Int? = null
    ): Call<Characters>

    /**
     * retrieve: Returns the information of an individual character.
     */
    @GET("character/{id}/")
    fun getCharacter(
        @Path("id") id: Int
    ): Call<Character>

    /**
     * Returns a list of issues for a character.
     */
    @GET("character/{id}/issue_list/")
    fun getCharacterIssueList(
        @Path("id") id: Int
    ): Call<IssueList>

    /**
     * list: Return a list of all the creators.
     */
    @GET("creator/")
    fun getCreators(
        @Query("cv_id") cv_id: Int? = null,
        @Query("modified_gt") modified_gt: String? = null,
        @Query("name") name: String? = null,
        @Query("page") page: Int? = null
    ): Call<Creators>

    /**
     * retrieve: Returns the information of an individual creator.
     */
    @GET("creator/{id}/")
    fun getCreator(
        @Path("id") id: Int
    ): Call<Creator>

    /**
     * list: Return a list of all the issues.
     */
    @GET("issue/")
    fun getIssues(
        @Query("cover_hash") cover_hash: String? = null,
        @Query("cover_month") cover_month: Int? = null,
        @Query("cover_year") cover_year: Int? = null,
        @Query("cv_id") cv_id: Int? = null,
        @Query("missing_cv_id") missing_cv_id: Boolean = cv_id != null,
        @Query("modified_gt") modified_gt: String? = null,
        @Query("number") number: String? = null,
        @Query("page") page: Int? = null,
        @Query("publisher_id") publisher_id: Int? = null,
        @Query("publisher_name") publisher_name: String? = null,
        @Query("series_id") series_id: Int? = null,
        @Query("series_name") series_name: String? = null,
        @Query("series_volume") series_volume: Int? = null,
        @Query("series_year_began") series_year_began: Int? = null,
        @Query("sku") sku: String? = null,
        @Query("store_date") store_date: String? = null,
        @Query("store_date_range_after") store_date_range_after: String? = null,
        @Query("store_date_range_before") store_date_range_before: String? = null,
        @Query("upc") upc: String? = null,
    ): Call<Issues>

    /**
     * retrieve: Returns the information of an individual issue.
     */
    @GET("issue/{id}/")
    fun getIssue(
        @Path("id") id: Int
    ): Call<Issue>

    /**
     * list: Returns a list of all publishers.
     */
    @GET("publisher/")
    fun getPublishers(
        @Query("cv_id") cv_id: Int? = null,
        @Query("modified_gt") modified_gt: String? = null,
        @Query("name") name: String? = null,
        @Query("page") page: Int? = null
    ): Call<Publishers>

    /**
     * retrieve: Returns the information of an individual publisher.
     */
    @GET("publisher/{id}/")
    fun getPublisher(
        @Path("id") id: Int
    ): Call<Publisher>

    /**
     * Returns a list of series for a publisher.
     */
    @GET("publisher/{id}/series_list/")
    fun getPublisherSeriesList(
        @Path("id") id: Int
    ): Call<PublisherSeriesList>

    /**
     * list: Returns a list of all the creator roles.
     */
    @GET("role/")
    fun getRoles(
        @Query("modified_gt") modified_gt: String? = null,
        @Query("name") name: String? = null,
        @Query("page") page: Int? = null
    ): Call<Roles>

    /**
     * list: Returns a list of all the comic series.
     */
    @GET("series/")
    fun getSeries(
        @Query("cv_id") cv_id: Int? = null,
        @Query("modified_gt") modified_gt: String? = null,
        @Query("name") name: String? = null,
        @Query("page") page: Int? = null,
        @Query("publisher_id") publisher_id: Int? = null,
        @Query("publisher_name") publisher_name: String? = null,
        @Query("series_type") series_type: String? = null,
        @Query("series_type_id") series_type_id: Int? = null,
        @Query("volume") volume: Int? = null,
        @Query("year_began") year_began: Int? = null,
        @Query("year_end") year_end: Int? = null,
    ): Call<SeriesList>

    /**
     * retrieve: Returns the information of an individual comic series.
     */
    @GET("series/{id}/")
    fun getSeries(
        @Path("id") id: Int
    ): Call<Series>

    /**
     * Returns a list of issues for a series.
     */
    @GET("series/{id}/issue_list/")
    fun getSeriesIssueList(
        @Path("id") id: Int
    ): Call<SeriesType>
}