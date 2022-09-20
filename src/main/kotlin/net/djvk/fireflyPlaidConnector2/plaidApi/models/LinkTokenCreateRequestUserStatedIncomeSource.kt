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
 * Specifies user stated income sources for the Income product
 *
 * @param employer The employer corresponding to an income source specified by the user
 * @param category
 * @param payPerCycle The income amount paid per cycle for a specified income source
 * @param payAnnual The income amount paid annually for a specified income source
 * @param payType
 * @param payFrequency
 */

data class LinkTokenCreateRequestUserStatedIncomeSource(

    /* The employer corresponding to an income source specified by the user */
    @field:JsonProperty("employer")
    val employer: kotlin.String? = null,

    @field:JsonProperty("category")
    val category: UserStatedIncomeSourceCategory? = null,

    /* The income amount paid per cycle for a specified income source */
    @field:JsonProperty("pay_per_cycle")
    val payPerCycle: kotlin.Double? = null,

    /* The income amount paid annually for a specified income source */
    @field:JsonProperty("pay_annual")
    val payAnnual: kotlin.Double? = null,

    @field:JsonProperty("pay_type")
    val payType: UserStatedIncomeSourcePayType? = null,

    @field:JsonProperty("pay_frequency")
    val payFrequency: UserStatedIncomeSourceFrequency? = null

)

