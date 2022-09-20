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
 * Paginated list of screening reviews
 *
 * @param watchlistScreeningReviews List of screening reviews
 * @param nextCursor An identifier that determines which page of results you receive.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
 */

data class PaginatedIndividualWatchlistScreeningReviewListResponse(

    /* List of screening reviews */
    @field:JsonProperty("watchlist_screening_reviews")
    val watchlistScreeningReviews: kotlin.collections.List<WatchlistScreeningReview>,

    /* An identifier that determines which page of results you receive. */
    @field:JsonProperty("next_cursor")
    val nextCursor: kotlin.String?,

    /* A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. */
    @field:JsonProperty("request_id")
    val requestId: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()

