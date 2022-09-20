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
 * An object specifying the arguments originally provided to the `/link/token/create` call.
 *
 * @param initialProducts The `products` specified in the `/link/token/create` call.
 * @param webhook The `webhook` specified in the `/link/token/create` call.
 * @param countryCodes The `country_codes` specified in the `/link/token/create` call.
 * @param language The `language` specified in the `/link/token/create` call.
 * @param redirectUri The `redirect_uri` specified in the `/link/token/create` call.
 * @param clientName The `client_name` specified in the `/link/token/create` call.
 * @param institutionData
 * @param accountFilters
 */

data class LinkTokenGetMetadataResponse(

    /* The `products` specified in the `/link/token/create` call. */
    @field:JsonProperty("initial_products")
    val initialProducts: kotlin.collections.List<Products>,

    /* The `webhook` specified in the `/link/token/create` call. */
    @field:JsonProperty("webhook")
    val webhook: kotlin.String?,

    /* The `country_codes` specified in the `/link/token/create` call. */
    @field:JsonProperty("country_codes")
    val countryCodes: kotlin.collections.List<CountryCode>,

    /* The `language` specified in the `/link/token/create` call. */
    @field:JsonProperty("language")
    val language: kotlin.String?,

    /* The `redirect_uri` specified in the `/link/token/create` call. */
    @field:JsonProperty("redirect_uri")
    val redirectUri: kotlin.String?,

    /* The `client_name` specified in the `/link/token/create` call. */
    @field:JsonProperty("client_name")
    val clientName: kotlin.String?,

    @field:JsonProperty("institution_data")
    val institutionData: LinkTokenCreateInstitutionData? = null,

    @field:JsonProperty("account_filters")
    val accountFilters: AccountFiltersResponse? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

