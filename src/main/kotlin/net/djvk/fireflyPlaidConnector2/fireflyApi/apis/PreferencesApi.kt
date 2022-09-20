/**
 * Firefly III API v1.5.6
 *
 * This is the documentation of the Firefly III API. You can find accompanying documentation on the website of Firefly III itself (see below). Please report any bugs or issues. You may use the \"Authorize\" button to try the API below. This file was last generated on 2022-04-04T03:54:41+00:00
 *
 * The version of the OpenAPI document: 1.5.6
 * Contact: james@firefly-iii.org
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package net.djvk.fireflyPlaidConnector2.fireflyApi.apis

import com.fasterxml.jackson.databind.ObjectMapper
import io.ktor.client.*
import io.ktor.client.engine.*
import net.djvk.fireflyPlaidConnector2.fireflyApi.infrastructure.*
import net.djvk.fireflyPlaidConnector2.fireflyApi.models.Preference
import net.djvk.fireflyPlaidConnector2.fireflyApi.models.PreferenceArray
import net.djvk.fireflyPlaidConnector2.fireflyApi.models.PreferenceSingle
import net.djvk.fireflyPlaidConnector2.fireflyApi.models.PreferenceUpdate

open class PreferencesApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonBlock: ObjectMapper.() -> Unit = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonBlock) {

    /**
     * Return a single preference.
     * Return a single preference and the value.
     * @param name The name of the preference.
     * @return PreferenceSingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getPreference(name: kotlin.String): HttpResponse<PreferenceSingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/preferences/{name}".replace("{" + "name" + "}", "$name"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * List all users preferences.
     * List all of the preferences of the user.
     * @param page Page number. The default pagination is 50. (optional)
     * @return PreferenceArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listPreference(page: kotlin.Int?): HttpResponse<PreferenceArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        page?.apply { localVariableQuery["page"] = listOf("$page") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/preferences",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Store a new preference for this user.
     * This endpoint creates a new preference. The name and data are free-format, and entirely up to you. If the preference is not used in Firefly III itself it may not be configurable through the user interface, but you can use this endpoint to persist custom data for your own app.
     * @param preference JSON array with the necessary preference information or key&#x3D;value pairs. See the model for the exact specifications.
     * @return PreferenceSingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun storePreference(preference: Preference): HttpResponse<PreferenceSingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody = preference

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/api/v1/preferences",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Update preference
     * Update a user&#39;s preference.
     * @param name The name of the preference. Will always overwrite. Will be created if it does not exist.
     * @param preferenceUpdate JSON array or key&#x3D;value pairs with the necessary preference information. See the model for the exact specifications.
     * @return PreferenceSingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun updatePreference(
        name: kotlin.String,
        preferenceUpdate: PreferenceUpdate
    ): HttpResponse<PreferenceSingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody = preferenceUpdate

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/api/v1/preferences/{name}".replace("{" + "name" + "}", "$name"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

}
