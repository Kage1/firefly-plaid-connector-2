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
 * No documentation available
 *
 * @param REPORTING_INFORMATION
 * @param SERVICE_PRODUCT_FULFILLMENT
 * @param VERIFICATION_OF_ASSET_RESPONSE
 */

data class VerificationOfAsset(

    @field:JsonProperty("REPORTING_INFORMATION")
    val REPORTING_INFORMATION: ReportingInformation,

    @field:JsonProperty("SERVICE_PRODUCT_FULFILLMENT")
    val SERVICE_PRODUCT_FULFILLMENT: ServiceProductFulfillment,

    @field:JsonProperty("VERIFICATION_OF_ASSET_RESPONSE")
    val VERIFICATION_OF_ASSET_RESPONSE: VerificationOfAssetResponse

) : kotlin.collections.HashMap<String, kotlin.Any>()

