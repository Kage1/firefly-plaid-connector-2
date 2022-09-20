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
 * PaymentInitiationConsent defines a payment initiation consent.
 *
 * @param consentId The consent ID.
 * @param status
 * @param createdAt Consent creation timestamp, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
 * @param recipientId The ID of the recipient the payment consent is for.
 * @param reference A reference for the payment consent.
 * @param constraints
 * @param scopes An array of payment consent scopes.
 */

data class PaymentInitiationConsent(

    /* The consent ID. */
    @field:JsonProperty("consent_id")
    val consentId: kotlin.String,

    @field:JsonProperty("status")
    val status: PaymentInitiationConsentStatus,

    /* Consent creation timestamp, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format. */
    @field:JsonProperty("created_at")
    val createdAt: java.time.OffsetDateTime,

    /* The ID of the recipient the payment consent is for. */
    @field:JsonProperty("recipient_id")
    val recipientId: kotlin.String,

    /* A reference for the payment consent. */
    @field:JsonProperty("reference")
    val reference: kotlin.String,

    @field:JsonProperty("constraints")
    val constraints: PaymentInitiationConsentConstraints,

    /* An array of payment consent scopes. */
    @field:JsonProperty("scopes")
    val scopes: kotlin.collections.List<PaymentInitiationConsentScope>

) : kotlin.collections.HashMap<String, kotlin.Any>()

