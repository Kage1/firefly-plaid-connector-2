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
 * Fired once Plaid calculates income from an Item.
 *
 * @param webhookType `INCOME`
 * @param webhookCode `PRODUCT_READY`
 * @param itemId The `item_id` of the Item associated with this webhook, warning, or error
 * @param error
 */

data class ItemProductReadyWebhook(

    /* `INCOME` */
    @field:JsonProperty("webhook_type")
    val webhookType: kotlin.String,

    /* `PRODUCT_READY` */
    @field:JsonProperty("webhook_code")
    val webhookCode: kotlin.String,

    /* The `item_id` of the Item associated with this webhook, warning, or error */
    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("error")
    val error: PlaidError? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

