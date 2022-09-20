/**
 * Firefly III API v1.5.6
 *
 * This is the documentation of the Firefly III API. You can find accompanying documentation on the website of Firefly III itself (see below). Please report any bugs or issues. You may use the \"Authorize\" button to try the API below. This file was last generated on 2022-04-04T03:54:41+00:00
 *
 * The version of the OpenAPI document: 1.5.6
 * Contact: james@firefly-iii.org
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

package net.djvk.fireflyPlaidConnector2.fireflyApi.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 *
 * @param budgetId The budget ID of the associated budget.
 * @param start Start date of the budget limit.
 * @param end End date of the budget limit.
 * @param amount
 * @param currencyId Use either currency_id or currency_code. Defaults to the user's default currency.
 * @param currencyCode Use either currency_id or currency_code. Defaults to the user's default currency.
 * @param period Period of the budget limit. Only used when auto-generated by auto-budget.
 */

data class BudgetLimitStore(

    /* The budget ID of the associated budget. */
    @field:JsonProperty("budget_id")
    val budgetId: kotlin.String,

    /* Start date of the budget limit. */
    @field:JsonProperty("start")
    val start: java.time.LocalDate,

    /* End date of the budget limit. */
    @field:JsonProperty("end")
    val end: java.time.LocalDate,

    @field:JsonProperty("amount")
    val amount: kotlin.String,

    /* Use either currency_id or currency_code. Defaults to the user's default currency. */
    @field:JsonProperty("currency_id")
    val currencyId: kotlin.String? = null,

    /* Use either currency_id or currency_code. Defaults to the user's default currency. */
    @field:JsonProperty("currency_code")
    val currencyCode: kotlin.String? = null,

    /* Period of the budget limit. Only used when auto-generated by auto-budget. */
    @field:JsonProperty("period")
    val period: kotlin.String? = null

)

