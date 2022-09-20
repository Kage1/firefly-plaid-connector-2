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
 * Fired when an Item's initial transaction pull is completed. Once this webhook has been fired, transaction data for the most recent 30 days can be fetched for the Item. If [Account Select v2](https://plaid.com/docs/link/customization/#account-select) is enabled, this webhook will also be fired if account selections for the Item are updated, with `new_transactions` set to the number of net new transactions pulled after the account selection update.
 *
 * @param webhookType `TRANSACTIONS`
 * @param webhookCode `INITIAL_UPDATE`
 * @param newTransactions The number of new, unfetched transactions available.
 * @param itemId The `item_id` of the Item associated with this webhook, warning, or error
 * @param error The error code associated with the webhook.
 */

data class InitialUpdateWebhook(

    /* `TRANSACTIONS` */
    @field:JsonProperty("webhook_type")
    val webhookType: kotlin.String,

    /* `INITIAL_UPDATE` */
    @field:JsonProperty("webhook_code")
    val webhookCode: kotlin.String,

    /* The number of new, unfetched transactions available. */
    @field:JsonProperty("new_transactions")
    val newTransactions: java.math.BigDecimal,

    /* The `item_id` of the Item associated with this webhook, warning, or error */
    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    /* The error code associated with the webhook. */
    @field:JsonProperty("error")
    val error: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

