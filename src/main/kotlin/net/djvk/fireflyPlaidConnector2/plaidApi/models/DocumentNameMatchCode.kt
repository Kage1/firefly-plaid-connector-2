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
 * A match summary describing the cross comparison between the subject's name, extracted from the document image, and the name they separately provided to identity verification attempt.
 *
 * Values: match,partialMatch,noMatch
 */

enum class DocumentNameMatchCode(val value: kotlin.String) {

    @JsonProperty(value = "match")
    match("match"),

    @JsonProperty(value = "partial_match")
    partialMatch("partial_match"),

    @JsonProperty(value = "no_match")
    noMatch("no_match");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is DocumentNameMatchCode) "$data" else null

        /**
         * Returns a valid [DocumentNameMatchCode] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): DocumentNameMatchCode? = data?.let {
            val normalizedData = "$it".lowercase()
            values().firstOrNull { value ->
                it == value || normalizedData == "$value".lowercase()
            }
        }
    }
}

