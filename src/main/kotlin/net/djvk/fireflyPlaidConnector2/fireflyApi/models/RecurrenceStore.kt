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
 * @param type
 * @param title
 * @param firstDate First time the recurring transaction will fire. Must be after today.
 * @param repeatUntil Date until the recurring transaction can fire. Use either this field or repetitions.
 * @param repetitions
 * @param transactions
 * @param description Not to be confused with the description of the actual transaction(s) being created.
 * @param nrOfRepetitions Max number of created transactions. Use either this field or repeat_until.
 * @param applyRules Whether or not to fire the rules after the creation of a transaction.
 * @param active If the recurrence is even active.
 * @param notes
 */

data class RecurrenceStore(

    @field:JsonProperty("type")
    val type: RecurrenceTransactionType,

    @field:JsonProperty("title")
    val title: kotlin.String,

    /* First time the recurring transaction will fire. Must be after today. */
    @field:JsonProperty("first_date")
    val firstDate: java.time.LocalDate,

    /* Date until the recurring transaction can fire. Use either this field or repetitions. */
    @field:JsonProperty("repeat_until")
    val repeatUntil: java.time.LocalDate?,

    @field:JsonProperty("repetitions")
    val repetitions: kotlin.collections.List<RecurrenceRepetitionStore>,

    @field:JsonProperty("transactions")
    val transactions: kotlin.collections.List<RecurrenceTransactionStore>,

    /* Not to be confused with the description of the actual transaction(s) being created. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* Max number of created transactions. Use either this field or repeat_until. */
    @field:JsonProperty("nr_of_repetitions")
    val nrOfRepetitions: kotlin.Int? = null,

    /* Whether or not to fire the rules after the creation of a transaction. */
    @field:JsonProperty("apply_rules")
    val applyRules: kotlin.Boolean? = null,

    /* If the recurrence is even active. */
    @field:JsonProperty("active")
    val active: kotlin.Boolean? = null,

    @field:JsonProperty("notes")
    val notes: kotlin.String? = null

)

