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
 * Information about the accounts that the payment was distributed to.
 *
 * @param accountName Name of the account for the given distribution.
 * @param bankName The name of the bank that the payment is being deposited to.
 * @param currentAmount The amount distributed to this account.
 * @param isoCurrencyCode The ISO-4217 currency code of the net pay. Always `null` if `unofficial_currency_code` is non-null.
 * @param mask The last 2-4 alphanumeric characters of an account's official account number.
 * @param type Type of the account that the paystub was sent to (e.g. 'checking').
 * @param unofficialCurrencyCode The unofficial currency code associated with the net pay. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.
 */

data class PayStubDistributionBreakdown(

    /* Name of the account for the given distribution. */
    @field:JsonProperty("account_name")
    val accountName: kotlin.String?,

    /* The name of the bank that the payment is being deposited to. */
    @field:JsonProperty("bank_name")
    val bankName: kotlin.String?,

    /* The amount distributed to this account. */
    @field:JsonProperty("current_amount")
    val currentAmount: kotlin.Double?,

    /* The ISO-4217 currency code of the net pay. Always `null` if `unofficial_currency_code` is non-null. */
    @field:JsonProperty("iso_currency_code")
    val isoCurrencyCode: kotlin.String?,

    /* The last 2-4 alphanumeric characters of an account's official account number. */
    @field:JsonProperty("mask")
    val mask: kotlin.String?,

    /* Type of the account that the paystub was sent to (e.g. 'checking'). */
    @field:JsonProperty("type")
    val type: kotlin.String?,

    /* The unofficial currency code associated with the net pay. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s. */
    @field:JsonProperty("unofficial_currency_code")
    val unofficialCurrencyCode: kotlin.String?

) : kotlin.collections.HashMap<String, kotlin.Any>()

