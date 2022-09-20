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
 * UserCreateResponse defines the response schema for `/user/create`
 *
 * @param userToken The user token associated with the User data is being requested for.
 * @param userId The Plaid `user_id` of the User associated with this webhook, warning, or error.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
 */

data class UserCreateResponse(

    /* The user token associated with the User data is being requested for. */
    @field:JsonProperty("user_token")
    val userToken: kotlin.String,

    /* The Plaid `user_id` of the User associated with this webhook, warning, or error. */
    @field:JsonProperty("user_id")
    val userId: kotlin.String,

    /* A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. */
    @field:JsonProperty("request_id")
    val requestId: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()

