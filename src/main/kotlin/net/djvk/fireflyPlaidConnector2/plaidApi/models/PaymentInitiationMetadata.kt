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
 * Metadata that captures what specific payment configurations an institution supports when making Payment Initiation requests.
 *
 * @param supportsInternationalPayments Indicates whether the institution supports payments from a different country.
 * @param supportsSepaInstant Indicates whether the institution supports SEPA Instant payments.
 * @param maximumPaymentAmount A mapping of currency to maximum payment amount (denominated in the smallest unit of currency) supported by the institution.  Example: `{\"GBP\": \"10000\"}`
 * @param supportsRefundDetails Indicates whether the institution supports returning refund details when initiating a payment.
 * @param standingOrderMetadata
 */

data class PaymentInitiationMetadata(

    /* Indicates whether the institution supports payments from a different country. */
    @field:JsonProperty("supports_international_payments")
    val supportsInternationalPayments: kotlin.Boolean,

    /* Indicates whether the institution supports SEPA Instant payments. */
    @field:JsonProperty("supports_sepa_instant")
    val supportsSepaInstant: kotlin.Boolean,

    /* A mapping of currency to maximum payment amount (denominated in the smallest unit of currency) supported by the institution.  Example: `{\"GBP\": \"10000\"}`  */
    @field:JsonProperty("maximum_payment_amount")
    val maximumPaymentAmount: kotlin.collections.Map<kotlin.String, kotlin.String>,

    /* Indicates whether the institution supports returning refund details when initiating a payment. */
    @field:JsonProperty("supports_refund_details")
    val supportsRefundDetails: kotlin.Boolean,

    @field:JsonProperty("standing_order_metadata")
    val standingOrderMetadata: PaymentInitiationStandingOrderMetadata?

) : kotlin.collections.HashMap<String, kotlin.Any>()

