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
 * The schema below describes the various `types` and corresponding `subtypes` that Plaid recognizes and reports for financial institution accounts.
 *
 * @param depository An account type holding cash, in which funds are deposited. Supported products for `depository` accounts are: Auth (`checking` and `savings` types only), Balance, Transactions, Identity, Payment Initiation, and Assets.
 * @param credit A credit card type account. Supported products for `credit` accounts are: Balance, Transactions, Identity, and Liabilities.
 * @param loan A loan type account. Supported products for `loan` accounts are: Balance, Liabilities, and Transactions.
 * @param investment An investment account. Supported products for `investment` accounts are: Balance and Investments. In API versions 2018-05-22 and earlier, this type is called `brokerage`.
 * @param other Other or unknown account type. Supported products for `other` accounts are: Balance, Transactions, Identity, and Assets.
 */

data class StandaloneAccountType(

    /* An account type holding cash, in which funds are deposited. Supported products for `depository` accounts are: Auth (`checking` and `savings` types only), Balance, Transactions, Identity, Payment Initiation, and Assets. */
    @field:JsonProperty("depository")
    val depository: kotlin.String,

    /* A credit card type account. Supported products for `credit` accounts are: Balance, Transactions, Identity, and Liabilities. */
    @field:JsonProperty("credit")
    val credit: kotlin.String,

    /* A loan type account. Supported products for `loan` accounts are: Balance, Liabilities, and Transactions. */
    @field:JsonProperty("loan")
    val loan: kotlin.String,

    /* An investment account. Supported products for `investment` accounts are: Balance and Investments. In API versions 2018-05-22 and earlier, this type is called `brokerage`. */
    @field:JsonProperty("investment")
    val investment: kotlin.String,

    /* Other or unknown account type. Supported products for `other` accounts are: Balance, Transactions, Identity, and Assets. */
    @field:JsonProperty("other")
    val other: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()

