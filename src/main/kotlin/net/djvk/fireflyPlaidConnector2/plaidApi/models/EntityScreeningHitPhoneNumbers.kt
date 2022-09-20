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
 * Phone number information associated with the entity screening hit
 *
 * @param type
 * @param phoneNumber A phone number in E.164 format.
 */

data class EntityScreeningHitPhoneNumbers(

    @field:JsonProperty("type")
    val type: PhoneType,

    /* A phone number in E.164 format. */
    @field:JsonProperty("phone_number")
    val phoneNumber: kotlin.String

)

