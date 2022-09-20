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
 * The verification refresh status. One of the following:  `\"VERIFICATION_REFRESH_STATUS_USER_PRESENCE_REQUIRED\"` User presence is required to refresh an income verification. `\"VERIFICATION_REFRESH_SUCCESSFUL\"` The income verification refresh was successful. `\"VERIFICATION_REFRESH_NOT_FOUND\"` No new data was found after the income verification refresh.
 *
 * Values: sTATUSUSERPRESENCEREQUIRED,sUCCESSFUL,nOTFOUND
 */

enum class VerificationRefreshStatus(val value: kotlin.String) {

    @JsonProperty(value = "VERIFICATION_REFRESH_STATUS_USER_PRESENCE_REQUIRED")
    sTATUSUSERPRESENCEREQUIRED("VERIFICATION_REFRESH_STATUS_USER_PRESENCE_REQUIRED"),

    @JsonProperty(value = "VERIFICATION_REFRESH_SUCCESSFUL")
    sUCCESSFUL("VERIFICATION_REFRESH_SUCCESSFUL"),

    @JsonProperty(value = "VERIFICATION_REFRESH_NOT_FOUND")
    nOTFOUND("VERIFICATION_REFRESH_NOT_FOUND");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is VerificationRefreshStatus) "$data" else null

        /**
         * Returns a valid [VerificationRefreshStatus] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): VerificationRefreshStatus? = data?.let {
            val normalizedData = "$it".lowercase()
            values().firstOrNull { value ->
                it == value || normalizedData == "$value".lowercase()
            }
        }
    }
}

