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
 * Student loan repayment information used to configure Sandbox test data for the Liabilities product
 *
 * @param type The only currently supported value for this field is `standard`.
 * @param nonRepaymentMonths Configures the number of months before repayment starts.
 * @param repaymentMonths Configures the number of months of repayments before the loan is paid off.
 */

data class StudentLoanRepaymentModel(

    /* The only currently supported value for this field is `standard`. */
    @field:JsonProperty("type")
    val type: kotlin.String,

    /* Configures the number of months before repayment starts. */
    @field:JsonProperty("non_repayment_months")
    val nonRepaymentMonths: java.math.BigDecimal,

    /* Configures the number of months of repayments before the loan is paid off. */
    @field:JsonProperty("repayment_months")
    val repaymentMonths: java.math.BigDecimal

) : kotlin.collections.HashMap<String, kotlin.Any>()

