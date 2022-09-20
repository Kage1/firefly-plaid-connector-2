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
 * Paginated list of dashboard users
 *
 * @param dashboardUsers List of dashboard users
 * @param nextCursor An identifier that determines which page of results you receive.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
 */

data class PaginatedDashboardUserListResponse(

    /* List of dashboard users */
    @field:JsonProperty("dashboard_users")
    val dashboardUsers: kotlin.collections.List<DashboardUser>,

    /* An identifier that determines which page of results you receive. */
    @field:JsonProperty("next_cursor")
    val nextCursor: kotlin.String?,

    /* A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. */
    @field:JsonProperty("request_id")
    val requestId: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()

