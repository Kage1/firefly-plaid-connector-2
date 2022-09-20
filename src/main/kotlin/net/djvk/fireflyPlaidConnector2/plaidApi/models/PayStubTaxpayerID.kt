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
 * Taxpayer ID of the individual receiving the paystub.
 *
 * @param idType Type of ID, e.g. 'SSN'.
 * @param idMask ID mask; i.e. last 4 digits of the taxpayer ID.
 */

data class PayStubTaxpayerID(

    /* Type of ID, e.g. 'SSN'. */
    @field:JsonProperty("id_type")
    val idType: kotlin.String?,

    /* ID mask; i.e. last 4 digits of the taxpayer ID. */
    @field:JsonProperty("id_mask")
    val idMask: kotlin.String?

) : kotlin.collections.HashMap<String, kotlin.Any>()

