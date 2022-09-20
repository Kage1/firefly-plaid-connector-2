/**
 * The Plaid API
 *
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.164.8
 *
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

package net.djvk.fireflyPlaidConnector2.plaidApi.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Describes the connected application for a particular end user.
 *
 * @param applicationId This field will map to the application ID that is returned from /item/applications/list, or provided to the institution in an oauth redirect.
 * @param name The name of the application
 * @param createdAt The date this application was linked in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.
 * @param displayName A human-readable name of the application for display purposes
 * @param logoUrl A URL that links to the application logo image.
 * @param applicationUrl The URL for the application's website
 * @param reasonForAccess A string provided by the connected app stating why they use their respective enabled products.
 * @param scopes
 */

data class ConnectedApplication(

    /* This field will map to the application ID that is returned from /item/applications/list, or provided to the institution in an oauth redirect. */
    @field:JsonProperty("application_id")
    val applicationId: kotlin.String,

    /* The name of the application */
    @field:JsonProperty("name")
    val name: kotlin.String,

    /* The date this application was linked in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC. */
    @field:JsonProperty("created_at")
    val createdAt: java.time.LocalDate,

    /* A human-readable name of the application for display purposes */
    @field:JsonProperty("display_name")
    val displayName: kotlin.String? = null,

    /* A URL that links to the application logo image. */
    @field:JsonProperty("logo_url")
    val logoUrl: kotlin.String? = null,

    /* The URL for the application's website */
    @field:JsonProperty("application_url")
    val applicationUrl: kotlin.String? = null,

    /* A string provided by the connected app stating why they use their respective enabled products. */
    @field:JsonProperty("reason_for_access")
    val reasonForAccess: kotlin.String? = null,

    @field:JsonProperty("scopes")
    val scopes: ScopesNullable? = null

)

