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
 * The amount of income earned year to date, as based on paystub data.
 *
 * @param grossEarnings Year-to-date gross earnings.
 * @param netEarnings Year-to-date net (take home) earnings.
 */

@Deprecated(message = "This schema is deprecated.")
data class PaystubYTDDetails(

    /* Year-to-date gross earnings. */
    @field:JsonProperty("gross_earnings")
    val grossEarnings: kotlin.Double? = null,

    /* Year-to-date net (take home) earnings. */
    @field:JsonProperty("net_earnings")
    val netEarnings: kotlin.Double? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

