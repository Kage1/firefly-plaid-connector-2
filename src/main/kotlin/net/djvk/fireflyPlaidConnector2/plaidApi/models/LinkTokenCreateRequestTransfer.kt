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
 * Specifies options for initializing Link for use with the Transfer product.
 *
 * @param intentId The `id` returned by the `/transfer/intent/create` endpoint.
 * @param paymentProfileId The `payment_profile_id` returned by the `/payment_profile/create` endpoint.
 */

data class LinkTokenCreateRequestTransfer(

    /* The `id` returned by the `/transfer/intent/create` endpoint. */
    @field:JsonProperty("intent_id")
    val intentId: kotlin.String? = null,

    /* The `payment_profile_id` returned by the `/payment_profile/create` endpoint. */
    @field:JsonProperty("payment_profile_id")
    val paymentProfileId: kotlin.String? = null

)

