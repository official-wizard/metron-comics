package cloud.metron.comic.api.v1

import cloud.metron.comic.api.CoreClient
import cloud.metron.comic.api.Credentials

/**
 * This [MetronClient] builds a metron.cloud client to access the API with the provided [Credentials] and [Version]
 */
class MetronClient(credentials: Credentials): CoreClient(credentials, "https://metron.cloud/api/") {

    // the API interface for the client
    val api: ComicInterface = retroClient.create(ComicInterface::class.java)
}