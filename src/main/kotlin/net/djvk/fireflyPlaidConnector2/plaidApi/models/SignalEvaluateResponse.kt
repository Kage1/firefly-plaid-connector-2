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
 * SignalEvaluateResponse defines the response schema for `/signal/income/evaluate`
 *
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
 * @param scores
 * @param coreAttributes
 */

data class SignalEvaluateResponse(

    /* A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. */
    @field:JsonProperty("request_id")
    val requestId: kotlin.String,

    @field:JsonProperty("scores")
    val scores: SignalScores,

    @field:JsonProperty("core_attributes")
    val coreAttributes: SignalEvaluateCoreAttributes? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

