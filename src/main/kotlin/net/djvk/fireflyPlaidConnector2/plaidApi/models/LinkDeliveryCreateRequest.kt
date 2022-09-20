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
 * LinkDeliveryCreateRequest defines the request schema for `/link_delivery/create`
 *
 * @param linkToken A `link_token` from a previous invocation of `/link/token/create` with Link Delivery enabled
 * @param deliveryMethod
 * @param deliveryDestination The email or phone number to be used to delivery the URL of the Link Delivery session
 * @param clientId Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.
 * @param secret Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.
 */

data class LinkDeliveryCreateRequest(

    /* A `link_token` from a previous invocation of `/link/token/create` with Link Delivery enabled */
    @field:JsonProperty("link_token")
    val linkToken: kotlin.String,

    @field:JsonProperty("delivery_method")
    val deliveryMethod: LinkDeliveryDeliveryMethod,

    /* The email or phone number to be used to delivery the URL of the Link Delivery session */
    @field:JsonProperty("delivery_destination")
    val deliveryDestination: kotlin.String,

    /* Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body. */
    @field:JsonProperty("client_id")
    val clientId: kotlin.String? = null,

    /* Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body. */
    @field:JsonProperty("secret")
    val secret: kotlin.String? = null

)

