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
 * The warning code identifies a specific kind of warning. `IDENTITY_UNAVAILABLE`: Unable to extract identity for the Item `TRANSACTIONS_UNAVAILABLE`: Unable to extract transactions for the Item `ITEM_UNAPPROVED`: User did not grant permission to share income data for the Item `REPORT_DELETED`: Report deleted due to customer or consumer request
 *
 * Values: iDENTITYUNAVAILABLE,tRANSACTIONSUNAVAILABLE,iTEMUNAPPROVED,rEPORTDELETED
 */

enum class CreditBankIncomeWarningCode(val value: kotlin.String) {

    @JsonProperty(value = "IDENTITY_UNAVAILABLE")
    iDENTITYUNAVAILABLE("IDENTITY_UNAVAILABLE"),

    @JsonProperty(value = "TRANSACTIONS_UNAVAILABLE")
    tRANSACTIONSUNAVAILABLE("TRANSACTIONS_UNAVAILABLE"),

    @JsonProperty(value = "ITEM_UNAPPROVED")
    iTEMUNAPPROVED("ITEM_UNAPPROVED"),

    @JsonProperty(value = "REPORT_DELETED")
    rEPORTDELETED("REPORT_DELETED");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CreditBankIncomeWarningCode) "$data" else null

        /**
         * Returns a valid [CreditBankIncomeWarningCode] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): CreditBankIncomeWarningCode? = data?.let {
            val normalizedData = "$it".lowercase()
            values().firstOrNull { value ->
                it == value || normalizedData == "$value".lowercase()
            }
        }
    }
}

