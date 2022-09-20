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
 * An optional object to filter `/investments/transactions/get` results. If provided, must be non-`null`.
 *
 * @param accountIds An array of `account_ids` to retrieve for the Item.
 * @param count The number of transactions to fetch.
 * @param offset The number of transactions to skip when fetching transaction history
 */

data class InvestmentsTransactionsGetRequestOptions(

    /* An array of `account_ids` to retrieve for the Item. */
    @field:JsonProperty("account_ids")
    val accountIds: kotlin.collections.List<kotlin.String>? = null,

    /* The number of transactions to fetch.  */
    @field:JsonProperty("count")
    val count: kotlin.Int? = 100,

    /* The number of transactions to skip when fetching transaction history */
    @field:JsonProperty("offset")
    val offset: kotlin.Int? = 0

)

