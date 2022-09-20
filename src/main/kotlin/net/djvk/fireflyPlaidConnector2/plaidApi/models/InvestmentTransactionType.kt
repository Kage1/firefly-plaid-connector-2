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
 * Value is one of the following: `buy`: Buying an investment `sell`: Selling an investment `cancel`: A cancellation of a pending transaction `cash`: Activity that modifies a cash position `fee`: A fee on the account `transfer`: Activity which modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer  For descriptions of possible transaction types and subtypes, see the [Investment transaction types schema](https://plaid.com/docs/api/accounts/#investment-transaction-types-schema).
 *
 * Values: buy,sell,cancel,cash,fee,transfer
 */

enum class InvestmentTransactionType(val value: kotlin.String) {

    @JsonProperty(value = "buy")
    buy("buy"),

    @JsonProperty(value = "sell")
    sell("sell"),

    @JsonProperty(value = "cancel")
    cancel("cancel"),

    @JsonProperty(value = "cash")
    cash("cash"),

    @JsonProperty(value = "fee")
    fee("fee"),

    @JsonProperty(value = "transfer")
    transfer("transfer");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is InvestmentTransactionType) "$data" else null

        /**
         * Returns a valid [InvestmentTransactionType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): InvestmentTransactionType? = data?.let {
            val normalizedData = "$it".lowercase()
            values().firstOrNull { value ->
                it == value || normalizedData == "$value".lowercase()
            }
        }
    }
}

