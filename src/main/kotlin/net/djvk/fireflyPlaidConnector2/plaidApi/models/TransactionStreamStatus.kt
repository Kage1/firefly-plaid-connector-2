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
 * The current status of the transaction stream.  `MATURE`: A `MATURE` recurring stream should have at least 3 transactions and happen on a regular cadence.  `EARLY_DETECTION`: When a recurring transaction first appears in the transaction history and before it fulfills the requirement of a mature stream, the status will be `EARLY_DETECTION`.  `TOMBSTONED`: A stream that was previously in the `EARLY_DETECTION` status will move to the `TOMBSTONED` status when no further transactions were found at the next expected date.  `UNKNOWN`: A stream is assigned an `UNKNOWN` status when none of the other statuses are applicable.
 *
 * Values: uNKNOWN,mATURE,eARLYDETECTION,tOMBSTONED
 */

enum class TransactionStreamStatus(val value: kotlin.String) {

    @JsonProperty(value = "UNKNOWN")
    uNKNOWN("UNKNOWN"),

    @JsonProperty(value = "MATURE")
    mATURE("MATURE"),

    @JsonProperty(value = "EARLY_DETECTION")
    eARLYDETECTION("EARLY_DETECTION"),

    @JsonProperty(value = "TOMBSTONED")
    tOMBSTONED("TOMBSTONED");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is TransactionStreamStatus) "$data" else null

        /**
         * Returns a valid [TransactionStreamStatus] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): TransactionStreamStatus? = data?.let {
            val normalizedData = "$it".lowercase()
            values().firstOrNull { value ->
                it == value || normalizedData == "$value".lowercase()
            }
        }
    }
}

