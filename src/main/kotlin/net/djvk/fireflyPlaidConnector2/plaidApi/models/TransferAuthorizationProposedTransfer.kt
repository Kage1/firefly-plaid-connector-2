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
 * Details regarding the proposed transfer.
 *
 * @param achClass
 * @param accountId The Plaid `account_id` for the account that will be debited or credited.
 * @param type
 * @param user
 * @param amount The amount of the transfer (decimal string with two digits of precision e.g. \"10.00\").
 * @param network The network or rails used for the transfer.
 * @param originationAccountId Plaid's unique identifier for the origination account that was used for this transfer.
 * @param isoCurrencyCode The currency of the transfer amount. The default value is \"USD\".
 */

data class TransferAuthorizationProposedTransfer(

    @field:JsonProperty("ach_class")
    val achClass: ACHClass,

    /* The Plaid `account_id` for the account that will be debited or credited. */
    @field:JsonProperty("account_id")
    val accountId: kotlin.String,

    @field:JsonProperty("type")
    val type: TransferType,

    @field:JsonProperty("user")
    val user: TransferUserInResponse,

    /* The amount of the transfer (decimal string with two digits of precision e.g. \"10.00\"). */
    @field:JsonProperty("amount")
    val amount: kotlin.String,

    /* The network or rails used for the transfer. */
    @field:JsonProperty("network")
    val network: kotlin.String,

    /* Plaid's unique identifier for the origination account that was used for this transfer. */
    @field:JsonProperty("origination_account_id")
    val originationAccountId: kotlin.String,

    /* The currency of the transfer amount. The default value is \"USD\". */
    @field:JsonProperty("iso_currency_code")
    val isoCurrencyCode: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()

