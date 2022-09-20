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
 * Analysis of the data extracted from the submitted document.
 *
 * @param name
 * @param dateOfBirth
 * @param expirationDate
 * @param issuingCountry
 */

data class PhysicalDocumentExtractedDataAnalysis(

    @field:JsonProperty("name")
    val name: DocumentNameMatchCode,

    @field:JsonProperty("date_of_birth")
    val dateOfBirth: DocumentDateOfBirthMatchCode,

    @field:JsonProperty("expiration_date")
    val expirationDate: ExpirationDate,

    @field:JsonProperty("issuing_country")
    val issuingCountry: IssuingCountry

)

