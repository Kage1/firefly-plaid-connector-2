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
 * An object representing the e-wallet
 *
 * @param walletId A unique ID identifying the e-wallet
 * @param balance
 * @param numbers
 */

data class Wallet(

    /* A unique ID identifying the e-wallet */
    @field:JsonProperty("wallet_id")
    val walletId: kotlin.String,

    @field:JsonProperty("balance")
    val balance: WalletBalance,

    @field:JsonProperty("numbers")
    val numbers: WalletNumbers

) : kotlin.collections.HashMap<String, kotlin.Any>()

