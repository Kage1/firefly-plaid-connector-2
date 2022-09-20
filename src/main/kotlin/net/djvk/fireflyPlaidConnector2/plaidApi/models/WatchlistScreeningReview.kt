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
 * A review submitted by a team member for an individual watchlist screening. A review can be either a comment on the current screening state, actions taken against hits attached to the watchlist screening, or both.
 *
 * @param id ID of the associated review.
 * @param confirmedHits Hits marked as a true positive after thorough manual review. These hits will never recur or be updated once dismissed. In most cases, confirmed hits indicate that the customer should be rejected.
 * @param dismissedHits Hits marked as a false positive after thorough manual review. These hits will never recur or be updated once dismissed.
 * @param comment A comment submitted by a team member as part of reviewing a watchlist screening.
 * @param auditTrail
 */

data class WatchlistScreeningReview(

    /* ID of the associated review. */
    @field:JsonProperty("id")
    val id: kotlin.String,

    /* Hits marked as a true positive after thorough manual review. These hits will never recur or be updated once dismissed. In most cases, confirmed hits indicate that the customer should be rejected. */
    @field:JsonProperty("confirmed_hits")
    val confirmedHits: kotlin.collections.List<kotlin.String>,

    /* Hits marked as a false positive after thorough manual review. These hits will never recur or be updated once dismissed. */
    @field:JsonProperty("dismissed_hits")
    val dismissedHits: kotlin.collections.List<kotlin.String>,

    /* A comment submitted by a team member as part of reviewing a watchlist screening. */
    @field:JsonProperty("comment")
    val comment: kotlin.String?,

    @field:JsonProperty("audit_trail")
    val auditTrail: WatchlistScreeningAuditTrail

)

