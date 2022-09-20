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
 * A program that configures the active lists, search parameters, and other behavior for initial and ongoing screening of individuals.
 *
 * @param id ID of the associated program.
 * @param createdAt An ISO8601 formatted timestamp.
 * @param isRescanningEnabled Indicator specifying whether the program is enabled and will perform daily rescans.
 * @param listsEnabled Watchlists enabled for the associated program
 * @param name A name for the program to define its purpose. For example, \"High Risk Individuals\", \"US Cardholders\", or \"Applicants\".
 * @param nameSensitivity
 * @param auditTrail
 * @param isArchived Archived programs are read-only and cannot screen new customers nor participate in ongoing monitoring.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
 */

data class IndividualWatchlistProgramResponse(

    /* ID of the associated program. */
    @field:JsonProperty("id")
    val id: kotlin.String,

    /* An ISO8601 formatted timestamp. */
    @field:JsonProperty("created_at")
    val createdAt: java.time.OffsetDateTime,

    /* Indicator specifying whether the program is enabled and will perform daily rescans. */
    @field:JsonProperty("is_rescanning_enabled")
    val isRescanningEnabled: kotlin.Boolean,

    /* Watchlists enabled for the associated program */
    @field:JsonProperty("lists_enabled")
    val listsEnabled: kotlin.collections.List<IndividualWatchlistCode>,

    /* A name for the program to define its purpose. For example, \"High Risk Individuals\", \"US Cardholders\", or \"Applicants\". */
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("name_sensitivity")
    val nameSensitivity: ProgramNameSensitivity,

    @field:JsonProperty("audit_trail")
    val auditTrail: WatchlistScreeningAuditTrail,

    /* Archived programs are read-only and cannot screen new customers nor participate in ongoing monitoring. */
    @field:JsonProperty("is_archived")
    val isArchived: kotlin.Boolean,

    /* A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. */
    @field:JsonProperty("request_id")
    val requestId: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()

