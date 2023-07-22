package cloud.metron.comic.api

/**
 * Credentials used to authenticate to the API
 *
 * [username] your https://metron.cloud/ username
 * [password] your https://metron.cloud/ password
 */
data class Credentials (val username: String, val password: String)