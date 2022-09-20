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
 * @param label This is the title of the current set. It can refer to an account, a budget or another object (by name).
 * @param currencyId The currency ID of the currency associated to the data in the entries.
 * @param currencyCode
 * @param currencySymbol
 * @param currencyDecimalPlaces Number of decimals for the currency associated to the data in the entries.
 * @param startDate
 * @param endDate
 * @param type Indicated the type of chart that is expected to be rendered. You can safely ignore this if you want.
 * @param yAxisID Used to indicate the Y axis for this data set. Is usually between 0 and 1 (left and right side of the chart).
 * @param propertyEntries The actual entries for this data set. They 'key' value is the label for the data point. The value is the actual (numerical) value.
 */

data class ChartDataSet(

    /* This is the title of the current set. It can refer to an account, a budget or another object (by name). */
    @field:JsonProperty("label")
    val label: kotlin.String? = null,

    /* The currency ID of the currency associated to the data in the entries. */
    @field:JsonProperty("currency_id")
    val currencyId: kotlin.String? = null,

    @field:JsonProperty("currency_code")
    val currencyCode: kotlin.String? = null,

    @field:JsonProperty("currency_symbol")
    val currencySymbol: kotlin.String? = null,

    /* Number of decimals for the currency associated to the data in the entries. */
    @field:JsonProperty("currency_decimal_places")
    val currencyDecimalPlaces: kotlin.Int? = null,

    @field:JsonProperty("start_date")
    val startDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("end_date")
    val endDate: java.time.OffsetDateTime? = null,

    /* Indicated the type of chart that is expected to be rendered. You can safely ignore this if you want. */
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    /* Used to indicate the Y axis for this data set. Is usually between 0 and 1 (left and right side of the chart). */
    @field:JsonProperty("yAxisID")
    val yAxisID: kotlin.Int? = null,

    /* The actual entries for this data set. They 'key' value is the label for the data point. The value is the actual (numerical) value. */
    @field:JsonProperty("entries")
    val propertyEntries: kotlin.collections.List<ChartDataPoint>? = null

)

