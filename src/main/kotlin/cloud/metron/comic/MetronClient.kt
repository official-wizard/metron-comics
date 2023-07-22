package cloud.metron.comic

import cloud.metron.comic.api.AuthenticatorInterceptor
import cloud.metron.comic.api.Credentials
import cloud.metron.comic.api.v1.ComicInterface
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * This [MetronClient] builds a metron.cloud client to access the API with the provided [Credentials] and [Version]
 */
class MetronClient(private val credentials: Credentials, version: Version) {

    // custom [OkHttpClient] client to add an authentication interceptor
    private var httpClient: OkHttpClient = OkHttpClient.Builder().apply {
        addInterceptor(AuthenticatorInterceptor(credentials.username, credentials.password))
    }.build()

    // custom [Retrofit] client to add custom [OkHttpClient] and add Gson (JSON) support
    private val retroClient: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(version.base)
        .client(httpClient)
        .build()

    // the API interface for the client
    val api: ComicInterface = retroClient.create(ComicInterface::class.java)

    // the API version for the interface to use
    enum class Version(val base: String) {
        V1("https://metron.cloud/api/")
    }
}