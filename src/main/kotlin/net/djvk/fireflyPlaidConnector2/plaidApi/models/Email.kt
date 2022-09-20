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
 * An object representing an email address
 *
 * @param `data` The email address.
 * @param primary When `true`, identifies the email address as the primary email on an account.
 * @param type The type of email account as described by the financial institution.
 */

data class Email(

    /* The email address. */
    @field:JsonProperty("data")
    val `data`: kotlin.String,

    /* When `true`, identifies the email address as the primary email on an account. */
    @field:JsonProperty("primary")
    val primary: kotlin.Boolean,

    /* The type of email account as described by the financial institution. */
    @field:JsonProperty("type")
    val type: Email.Type

) : kotlin.collections.HashMap<String, kotlin.Any>() {

    /**
     * The type of email account as described by the financial institution.
     *
     * Values: primary,secondary,other
     */
    enum class Type(val value: kotlin.String) {
        @JsonProperty(value = "primary")
        primary("primary"),
        @JsonProperty(value = "secondary")
        secondary("secondary"),
        @JsonProperty(value = "other")
        other("other");
    }
}

