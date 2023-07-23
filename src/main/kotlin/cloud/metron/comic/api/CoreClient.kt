package cloud.metron.comic.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class CoreClient(credentials: Credentials, baseUrl: String) {
    // custom [OkHttpClient] client to add an authentication interceptor
    private var httpClient: OkHttpClient = OkHttpClient.Builder().apply {
        addInterceptor(AuthenticatorInterceptor(credentials.username, credentials.password))
    }.build()

    // custom [Retrofit] client to add custom [OkHttpClient] and add Gson (JSON) support
    protected val retroClient: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(baseUrl)
        .client(httpClient)
        .build()
}