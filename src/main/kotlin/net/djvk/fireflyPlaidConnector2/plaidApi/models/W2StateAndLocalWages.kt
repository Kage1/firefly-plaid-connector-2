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
 * W2 state and local wages
 *
 * @param state State associated with the wage.
 * @param employerStateIdNumber State identification number of the employer.
 * @param stateWagesTips Wages and tips from the specified state.
 * @param stateIncomeTax Income tax from the specified state.
 * @param localWagesTips Wages and tips from the locality.
 * @param localIncomeTax Income tax from the locality.
 * @param localityName Name of the locality.
 */

data class W2StateAndLocalWages(

    /* State associated with the wage. */
    @field:JsonProperty("state")
    val state: kotlin.String? = null,

    /* State identification number of the employer. */
    @field:JsonProperty("employer_state_id_number")
    val employerStateIdNumber: kotlin.String? = null,

    /* Wages and tips from the specified state. */
    @field:JsonProperty("state_wages_tips")
    val stateWagesTips: kotlin.String? = null,

    /* Income tax from the specified state. */
    @field:JsonProperty("state_income_tax")
    val stateIncomeTax: kotlin.String? = null,

    /* Wages and tips from the locality. */
    @field:JsonProperty("local_wages_tips")
    val localWagesTips: kotlin.String? = null,

    /* Income tax from the locality. */
    @field:JsonProperty("local_income_tax")
    val localIncomeTax: kotlin.String? = null,

    /* Name of the locality. */
    @field:JsonProperty("locality_name")
    val localityName: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

