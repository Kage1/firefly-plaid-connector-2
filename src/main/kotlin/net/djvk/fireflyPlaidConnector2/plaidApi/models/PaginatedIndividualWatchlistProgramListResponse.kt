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
 * Paginated list of individual watchlist screening programs
 *
 * @param watchlistPrograms List of individual watchlist screening programs
 * @param nextCursor An identifier that determines which page of results you receive.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
 */

data class PaginatedIndividualWatchlistProgramListResponse(

    /* List of individual watchlist screening programs */
    @field:JsonProperty("watchlist_programs")
    val watchlistPrograms: kotlin.collections.List<IndividualWatchlistProgram>,

    /* An identifier that determines which page of results you receive. */
    @field:JsonProperty("next_cursor")
    val nextCursor: kotlin.String?,

    /* A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. */
    @field:JsonProperty("request_id")
    val requestId: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()

