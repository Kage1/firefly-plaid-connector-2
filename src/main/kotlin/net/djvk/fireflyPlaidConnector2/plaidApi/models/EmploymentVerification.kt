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
 * An object containing proof of employment data for an individual
 *
 * @param status
 * @param startDate Start of employment in ISO 8601 format (YYYY-MM-DD).
 * @param endDate End of employment, if applicable. Provided in ISO 8601 format (YYY-MM-DD).
 * @param employer
 * @param title Current title of employee.
 * @param platformIds
 */

data class EmploymentVerification(

    @field:JsonProperty("status")
    val status: EmploymentVerificationStatus? = null,

    /* Start of employment in ISO 8601 format (YYYY-MM-DD). */
    @field:JsonProperty("start_date")
    val startDate: java.time.LocalDate? = null,

    /* End of employment, if applicable. Provided in ISO 8601 format (YYY-MM-DD). */
    @field:JsonProperty("end_date")
    val endDate: java.time.LocalDate? = null,

    @field:JsonProperty("employer")
    val employer: EmployerVerification? = null,

    /* Current title of employee. */
    @field:JsonProperty("title")
    val title: kotlin.String? = null,

    @field:JsonProperty("platform_ids")
    val platformIds: PlatformIds? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

