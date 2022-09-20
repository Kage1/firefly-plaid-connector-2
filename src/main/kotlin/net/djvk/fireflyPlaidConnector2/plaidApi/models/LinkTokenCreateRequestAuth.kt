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
 * Specifies options for initializing Link for use with the Auth product. This field can be used to enable or disable extended Auth flows for the resulting Link session. Omitting any field will result in a default that can be configured by your account manager.
 *
 * @param authTypeSelectEnabled Specifies whether Auth Type Select is enabled for the Link session, allowing the end user to choose between linking instantly or manually prior to selecting their financial institution. Note that this can only be true if `same_day_microdeposits_enabled` is set to true.
 * @param automatedMicrodepositsEnabled Specifies whether the Link session is enabled for the Automated Micro-deposits flow.
 * @param instantMatchEnabled Specifies whether the Link session is enabled for the Instant Match flow.
 * @param sameDayMicrodepositsEnabled Specifies whether the Link session is enabled for the Same Day Micro-deposits flow.
 * @param flowType This field has been deprecated in favor of `auth_type_select_enabled`.
 */

data class LinkTokenCreateRequestAuth(

    /* Specifies whether Auth Type Select is enabled for the Link session, allowing the end user to choose between linking instantly or manually prior to selecting their financial institution. Note that this can only be true if `same_day_microdeposits_enabled` is set to true. */
    @field:JsonProperty("auth_type_select_enabled")
    val authTypeSelectEnabled: kotlin.Boolean? = false,

    /* Specifies whether the Link session is enabled for the Automated Micro-deposits flow. */
    @field:JsonProperty("automated_microdeposits_enabled")
    val automatedMicrodepositsEnabled: kotlin.Boolean? = null,

    /* Specifies whether the Link session is enabled for the Instant Match flow. */
    @field:JsonProperty("instant_match_enabled")
    val instantMatchEnabled: kotlin.Boolean? = null,

    /* Specifies whether the Link session is enabled for the Same Day Micro-deposits flow. */
    @field:JsonProperty("same_day_microdeposits_enabled")
    val sameDayMicrodepositsEnabled: kotlin.Boolean? = null,

    /* This field has been deprecated in favor of `auth_type_select_enabled`. */
    @field:JsonProperty("flow_type")
    @Deprecated(message = "This property is deprecated.")
    val flowType: LinkTokenCreateRequestAuth.FlowType? = null

) {

    /**
     * This field has been deprecated in favor of `auth_type_select_enabled`.
     *
     * Values: fLEXIBLEAUTH
     */
    enum class FlowType(val value: kotlin.String) {
        @JsonProperty(value = "FLEXIBLE_AUTH")
        fLEXIBLEAUTH("FLEXIBLE_AUTH");
    }
}

