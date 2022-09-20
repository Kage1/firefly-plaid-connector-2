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
 * Represents an event in the Bank Transfers API.
 *
 * @param eventId Plaid’s unique identifier for this event. IDs are sequential unsigned 64-bit integers.
 * @param timestamp The datetime when this event occurred. This will be of the form `2006-01-02T15:04:05Z`.
 * @param eventType
 * @param accountId The account ID associated with the bank transfer.
 * @param bankTransferId Plaid’s unique identifier for a bank transfer.
 * @param originationAccountId The ID of the origination account that this balance belongs to.
 * @param bankTransferType
 * @param bankTransferAmount The bank transfer amount.
 * @param bankTransferIsoCurrencyCode The currency of the bank transfer amount.
 * @param failureReason
 * @param direction
 */

data class BankTransferEvent(

    /* Plaid’s unique identifier for this event. IDs are sequential unsigned 64-bit integers. */
    @field:JsonProperty("event_id")
    val eventId: kotlin.Int,

    /* The datetime when this event occurred. This will be of the form `2006-01-02T15:04:05Z`. */
    @field:JsonProperty("timestamp")
    val timestamp: java.time.OffsetDateTime,

    @field:JsonProperty("event_type")
    val eventType: BankTransferEventType,

    /* The account ID associated with the bank transfer. */
    @field:JsonProperty("account_id")
    val accountId: kotlin.String,

    /* Plaid’s unique identifier for a bank transfer. */
    @field:JsonProperty("bank_transfer_id")
    val bankTransferId: kotlin.String,

    /* The ID of the origination account that this balance belongs to. */
    @field:JsonProperty("origination_account_id")
    val originationAccountId: kotlin.String?,

    @field:JsonProperty("bank_transfer_type")
    val bankTransferType: BankTransferType,

    /* The bank transfer amount. */
    @field:JsonProperty("bank_transfer_amount")
    val bankTransferAmount: kotlin.String,

    /* The currency of the bank transfer amount. */
    @field:JsonProperty("bank_transfer_iso_currency_code")
    val bankTransferIsoCurrencyCode: kotlin.String,

    @field:JsonProperty("failure_reason")
    val failureReason: BankTransferFailure?,

    @field:JsonProperty("direction")
    val direction: BankTransferDirection?

) : kotlin.collections.HashMap<String, kotlin.Any>()

