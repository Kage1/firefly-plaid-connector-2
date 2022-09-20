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
 * IdentityGetResponse defines the response schema for `/identity/get`
 *
 * @param accounts The accounts for which Identity data has been requested
 * @param item
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
 */

data class IdentityGetResponse(

    /* The accounts for which Identity data has been requested */
    @field:JsonProperty("accounts")
    val accounts: kotlin.collections.List<AccountIdentity>,

    @field:JsonProperty("item")
    val item: Item,

    /* A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. */
    @field:JsonProperty("request_id")
    val requestId: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()

