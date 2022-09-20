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
 * An object representing information about the net pay amount on the paystub.
 *
 * @param currentAmount Raw amount of the net pay for the pay period
 * @param description Description of the net pay
 * @param isoCurrencyCode The ISO-4217 currency code of the net pay. Always `null` if `unofficial_currency_code` is non-null.
 * @param unofficialCurrencyCode The unofficial currency code associated with the net pay. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.
 * @param ytdAmount The year-to-date amount of the net pay
 * @param total
 */

data class NetPay(

    /* Raw amount of the net pay for the pay period */
    @field:JsonProperty("current_amount")
    val currentAmount: kotlin.Double? = null,

    /* Description of the net pay */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The ISO-4217 currency code of the net pay. Always `null` if `unofficial_currency_code` is non-null. */
    @field:JsonProperty("iso_currency_code")
    val isoCurrencyCode: kotlin.String? = null,

    /* The unofficial currency code associated with the net pay. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s. */
    @field:JsonProperty("unofficial_currency_code")
    val unofficialCurrencyCode: kotlin.String? = null,

    /* The year-to-date amount of the net pay */
    @field:JsonProperty("ytd_amount")
    val ytdAmount: kotlin.Double? = null,

    @field:JsonProperty("total")
    @Deprecated(message = "This property is deprecated.")
    val total: Total? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

