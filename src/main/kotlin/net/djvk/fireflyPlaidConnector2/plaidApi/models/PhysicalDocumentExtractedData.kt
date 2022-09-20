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
 * Data extracted from a user-submitted document.
 *
 * @param idNumber Alpha-numeric ID number extracted via OCR from the user's document image.
 * @param category
 * @param expirationDate
 * @param issuingCountry Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.
 */

data class PhysicalDocumentExtractedData(

    /* Alpha-numeric ID number extracted via OCR from the user's document image. */
    @field:JsonProperty("id_number")
    val idNumber: kotlin.String?,

    @field:JsonProperty("category")
    val category: PhysicalDocumentCategory,

    @field:JsonProperty("expiration_date")
    val expirationDate: java.time.LocalDate?,

    /* Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form. */
    @field:JsonProperty("issuing_country")
    val issuingCountry: kotlin.String

)

