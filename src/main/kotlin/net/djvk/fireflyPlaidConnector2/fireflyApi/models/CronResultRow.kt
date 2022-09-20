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
 * @param jobFired This value tells you if this specific cron job actually fired. It may not fire. Some cron jobs only fire every 24 hours, for example.
 * @param jobSucceeded This value tells you if this specific cron job actually did something. The job may fire but not change anything.
 * @param jobErrored If the cron job ran into some kind of an error, this value will be true.
 * @param message If the cron job ran into some kind of an error, this value will be the error message. The success message if the job actually ran OK.
 */

data class CronResultRow(

    /* This value tells you if this specific cron job actually fired. It may not fire. Some cron jobs only fire every 24 hours, for example.  */
    @field:JsonProperty("job_fired")
    val jobFired: kotlin.Boolean? = null,

    /* This value tells you if this specific cron job actually did something. The job may fire but not change anything.  */
    @field:JsonProperty("job_succeeded")
    val jobSucceeded: kotlin.Boolean? = null,

    /* If the cron job ran into some kind of an error, this value will be true. */
    @field:JsonProperty("job_errored")
    val jobErrored: kotlin.Boolean? = null,

    /* If the cron job ran into some kind of an error, this value will be the error message. The success message if the job actually ran OK.  */
    @field:JsonProperty("message")
    val message: kotlin.String? = null

)

