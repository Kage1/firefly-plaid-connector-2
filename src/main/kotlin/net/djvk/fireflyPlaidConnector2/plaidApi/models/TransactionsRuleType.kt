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
 * Transaction rule's match type. For TRANSACTION_ID field, EXACT_MATCH is available. Matches are case sensitive.
 *
 * Values: eXACTMATCH,sUBSTRINGMATCH
 */

enum class TransactionsRuleType(val value: kotlin.String) {

    @JsonProperty(value = "EXACT_MATCH")
    eXACTMATCH("EXACT_MATCH"),

    @JsonProperty(value = "SUBSTRING_MATCH")
    sUBSTRINGMATCH("SUBSTRING_MATCH");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is TransactionsRuleType) "$data" else null

        /**
         * Returns a valid [TransactionsRuleType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): TransactionsRuleType? = data?.let {
            val normalizedData = "$it".lowercase()
            values().firstOrNull { value ->
                it == value || normalizedData == "$value".lowercase()
            }
        }
    }
}

