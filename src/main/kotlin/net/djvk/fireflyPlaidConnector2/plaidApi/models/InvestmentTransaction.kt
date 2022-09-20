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
 * A transaction within an investment account.
 *
 * @param investmentTransactionId The ID of the Investment transaction, unique across all Plaid transactions. Like all Plaid identifiers, the `investment_transaction_id` is case sensitive.
 * @param accountId The `account_id` of the account against which this transaction posted.
 * @param securityId The `security_id` to which this transaction is related.
 * @param date The [ISO 8601](https://wikipedia.org/wiki/ISO_8601) posting date for the transaction.
 * @param name The institution’s description of the transaction.
 * @param quantity The number of units of the security involved in this transaction.
 * @param amount The complete value of the transaction. Positive values when cash is debited, e.g. purchases of stock; negative values when cash is credited, e.g. sales of stock. Treatment remains the same for cash-only movements unassociated with securities.
 * @param price The price of the security at which this transaction occurred.
 * @param fees The combined value of all fees applied to this transaction
 * @param type
 * @param subtype
 * @param isoCurrencyCode The ISO-4217 currency code of the transaction. Always `null` if `unofficial_currency_code` is non-`null`.
 * @param unofficialCurrencyCode The unofficial currency code associated with the holding. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.
 * @param cancelTransactionId A legacy field formerly used internally by Plaid to identify certain canceled transactions.
 */

data class InvestmentTransaction(

    /* The ID of the Investment transaction, unique across all Plaid transactions. Like all Plaid identifiers, the `investment_transaction_id` is case sensitive. */
    @field:JsonProperty("investment_transaction_id")
    val investmentTransactionId: kotlin.String,

    /* The `account_id` of the account against which this transaction posted. */
    @field:JsonProperty("account_id")
    val accountId: kotlin.String,

    /* The `security_id` to which this transaction is related. */
    @field:JsonProperty("security_id")
    val securityId: kotlin.String?,

    /* The [ISO 8601](https://wikipedia.org/wiki/ISO_8601) posting date for the transaction. */
    @field:JsonProperty("date")
    val date: java.time.LocalDate,

    /* The institution’s description of the transaction. */
    @field:JsonProperty("name")
    val name: kotlin.String,

    /* The number of units of the security involved in this transaction. */
    @field:JsonProperty("quantity")
    val quantity: kotlin.Double,

    /* The complete value of the transaction. Positive values when cash is debited, e.g. purchases of stock; negative values when cash is credited, e.g. sales of stock. Treatment remains the same for cash-only movements unassociated with securities. */
    @field:JsonProperty("amount")
    val amount: kotlin.Double,

    /* The price of the security at which this transaction occurred. */
    @field:JsonProperty("price")
    val price: kotlin.Double,

    /* The combined value of all fees applied to this transaction */
    @field:JsonProperty("fees")
    val fees: kotlin.Double?,

    @field:JsonProperty("type")
    val type: InvestmentTransactionType,

    @field:JsonProperty("subtype")
    val subtype: InvestmentTransactionSubtype,

    /* The ISO-4217 currency code of the transaction. Always `null` if `unofficial_currency_code` is non-`null`. */
    @field:JsonProperty("iso_currency_code")
    val isoCurrencyCode: kotlin.String?,

    /* The unofficial currency code associated with the holding. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s. */
    @field:JsonProperty("unofficial_currency_code")
    val unofficialCurrencyCode: kotlin.String?,

    /* A legacy field formerly used internally by Plaid to identify certain canceled transactions. */
    @field:JsonProperty("cancel_transaction_id")
    @Deprecated(message = "This property is deprecated.")
    val cancelTransactionId: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

