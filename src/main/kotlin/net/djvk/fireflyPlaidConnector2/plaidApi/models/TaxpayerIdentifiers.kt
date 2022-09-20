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
 * The collection of TAXPAYER_IDENTIFICATION elements
 *
 * @param TAXPAYER_IDENTIFIER
 */

data class TaxpayerIdentifiers(

    @field:JsonProperty("TAXPAYER_IDENTIFIER")
    val TAXPAYER_IDENTIFIER: TaxpayerIdentifier

) : kotlin.collections.HashMap<String, kotlin.Any>()

