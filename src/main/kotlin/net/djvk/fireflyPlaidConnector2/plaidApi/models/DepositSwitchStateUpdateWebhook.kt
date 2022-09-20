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
 * Fired when the status of a deposit switch request has changed.
 *
 * @param webhookType `\"DEPOSIT_SWITCH\"`
 * @param webhookCode `\"SWITCH_STATE_UPDATE\"`
 * @param state  The state, or status, of the deposit switch.  `initialized`: The deposit switch has been initialized with the user entering the information required to submit the deposit switch request.  `processing`: The deposit switch request has been submitted and is being processed.  `completed`: The user's employer has fulfilled and completed the deposit switch request.  `error`: There was an error processing the deposit switch request.  For more information, see the [Deposit Switch API reference](/docs/deposit-switch/reference#deposit_switchget).
 * @param depositSwitchId The ID of the deposit switch.
 */

data class DepositSwitchStateUpdateWebhook(

    /* `\"DEPOSIT_SWITCH\"` */
    @field:JsonProperty("webhook_type")
    val webhookType: kotlin.String? = null,

    /* `\"SWITCH_STATE_UPDATE\"` */
    @field:JsonProperty("webhook_code")
    val webhookCode: kotlin.String? = null,

    /*  The state, or status, of the deposit switch.  `initialized`: The deposit switch has been initialized with the user entering the information required to submit the deposit switch request.  `processing`: The deposit switch request has been submitted and is being processed.  `completed`: The user's employer has fulfilled and completed the deposit switch request.  `error`: There was an error processing the deposit switch request.  For more information, see the [Deposit Switch API reference](/docs/deposit-switch/reference#deposit_switchget). */
    @field:JsonProperty("state")
    val state: kotlin.String? = null,

    /* The ID of the deposit switch. */
    @field:JsonProperty("deposit_switch_id")
    val depositSwitchId: kotlin.String? = null

)

