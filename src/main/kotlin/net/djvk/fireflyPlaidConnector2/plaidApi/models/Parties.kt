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
 * A collection of objects that define specific parties to a deal. This includes the direct participating parties, such as borrower and seller and the indirect parties such as the credit report provider.
 *
 * @param PARTY
 */

data class Parties(

    @field:JsonProperty("PARTY")
    val PARTY: kotlin.collections.List<Party>

) : kotlin.collections.HashMap<String, kotlin.Any>()

