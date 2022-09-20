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
 * Commonly used term to describe the earning line item.
 *
 * Values: bONUS,cOMMISSION,oVERTIME,pAIDTIMEOFF,rEGULARPAY,vACATION,bASICALLOWANCEHOUSING,bASICALLOWANCESUBSISTENCE,oTHER,`null`
 */

enum class EarningsBreakdownCanonicalDescription(val value: kotlin.String) {

    @JsonProperty(value = "BONUS")
    bONUS("BONUS"),

    @JsonProperty(value = "COMMISSION")
    cOMMISSION("COMMISSION"),

    @JsonProperty(value = "OVERTIME")
    oVERTIME("OVERTIME"),

    @JsonProperty(value = "PAID TIME OFF")
    pAIDTIMEOFF("PAID TIME OFF"),

    @JsonProperty(value = "REGULAR PAY")
    rEGULARPAY("REGULAR PAY"),

    @JsonProperty(value = "VACATION")
    vACATION("VACATION"),

    @JsonProperty(value = "BASIC ALLOWANCE HOUSING")
    bASICALLOWANCEHOUSING("BASIC ALLOWANCE HOUSING"),

    @JsonProperty(value = "BASIC ALLOWANCE SUBSISTENCE")
    bASICALLOWANCESUBSISTENCE("BASIC ALLOWANCE SUBSISTENCE"),

    @JsonProperty(value = "OTHER")
    oTHER("OTHER"),

    @JsonProperty(value = "null")
    `null`("null");

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
        fun encode(data: kotlin.Any?): kotlin.String? =
            if (data is EarningsBreakdownCanonicalDescription) "$data" else null

        /**
         * Returns a valid [EarningsBreakdownCanonicalDescription] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): EarningsBreakdownCanonicalDescription? = data?.let {
            val normalizedData = "$it".lowercase()
            values().firstOrNull { value ->
                it == value || normalizedData == "$value".lowercase()
            }
        }
    }
}

