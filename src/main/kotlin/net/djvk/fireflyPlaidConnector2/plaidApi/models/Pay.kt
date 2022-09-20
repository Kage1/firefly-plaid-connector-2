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
 * An object representing a monetary amount.
 *
 * @param amount A numerical amount of a specific currency.
 * @param currency Currency code, e.g. USD
 */

@Deprecated(message = "This schema is deprecated.")
data class Pay(

    /* A numerical amount of a specific currency. */
    @field:JsonProperty("amount")
    val amount: kotlin.Double? = null,

    /* Currency code, e.g. USD */
    @field:JsonProperty("currency")
    val currency: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

