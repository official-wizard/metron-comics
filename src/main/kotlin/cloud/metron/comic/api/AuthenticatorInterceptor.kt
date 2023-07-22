package cloud.metron.comic.api

import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

/**
 * This [Interceptor] takes care of the authentication process between requests
 */
class AuthenticatorInterceptor(username: String, password: String): Interceptor {
    private val credentials = Credentials.basic(username, password)

    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()

        val authenticatedRequest: Request = request.newBuilder()
            .header("Authorization", credentials).build()

        return chain.proceed(authenticatedRequest)
    }
}