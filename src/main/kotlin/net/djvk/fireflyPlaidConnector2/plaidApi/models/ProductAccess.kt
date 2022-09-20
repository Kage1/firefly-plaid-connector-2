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
 * The product access being requested. Used to or disallow product access across all accounts. If unset, defaults to all products allowed.
 *
 * @param statements Allow access to statements. Only used by certain partners. If relevant to the partner and unset, defaults to `true`.
 * @param identity Allow access to the Identity product (name, email, phone, address). Only used by certain partners. If relevant to the partner and unset, defaults to `true`.
 * @param auth Allow access to account number details. Only used by certain partners. If relevant to the partner and unset, defaults to `true`.
 * @param transactions Allow access to transaction details. Only used by certain partners. If relevant to the partner and unset, defaults to `true`.
 * @param accountsDetailsTransactions Allow access to \"accounts_details_transactions\". Only used by certain partners. If relevant to the partner and unset, defaults to `true`.
 * @param accountsRoutingNumber Allow access to \"accounts_routing_number\". Only used by certain partners. If relevant to the partner and unset, defaults to `true`.
 * @param accountsStatements Allow access to \"accounts_statements\". Only used by certain partners. If relevant to the partner and unset, defaults to `true`.
 * @param accountsTaxStatements Allow access to \"accounts_tax_statements\". Only used by certain partners. If relevant to the partner and unset, defaults to `true`.
 * @param customersProfiles Allow access to \"customers_profiles\". Only used by certain partners. If relevant to the partner and unset, defaults to `true`.
 */

data class ProductAccess(

    /* Allow access to statements. Only used by certain partners. If relevant to the partner and unset, defaults to `true`. */
    @field:JsonProperty("statements")
    val statements: kotlin.Boolean? = true,

    /* Allow access to the Identity product (name, email, phone, address). Only used by certain partners. If relevant to the partner and unset, defaults to `true`. */
    @field:JsonProperty("identity")
    val identity: kotlin.Boolean? = true,

    /* Allow access to account number details. Only used by certain partners. If relevant to the partner and unset, defaults to `true`. */
    @field:JsonProperty("auth")
    val auth: kotlin.Boolean? = true,

    /* Allow access to transaction details. Only used by certain partners. If relevant to the partner and unset, defaults to `true`. */
    @field:JsonProperty("transactions")
    val transactions: kotlin.Boolean? = true,

    /* Allow access to \"accounts_details_transactions\". Only used by certain partners. If relevant to the partner and unset, defaults to `true`. */
    @field:JsonProperty("accounts_details_transactions")
    val accountsDetailsTransactions: kotlin.Boolean? = true,

    /* Allow access to \"accounts_routing_number\". Only used by certain partners. If relevant to the partner and unset, defaults to `true`. */
    @field:JsonProperty("accounts_routing_number")
    val accountsRoutingNumber: kotlin.Boolean? = true,

    /* Allow access to \"accounts_statements\". Only used by certain partners. If relevant to the partner and unset, defaults to `true`. */
    @field:JsonProperty("accounts_statements")
    val accountsStatements: kotlin.Boolean? = true,

    /* Allow access to \"accounts_tax_statements\". Only used by certain partners. If relevant to the partner and unset, defaults to `true`. */
    @field:JsonProperty("accounts_tax_statements")
    val accountsTaxStatements: kotlin.Boolean? = true,

    /* Allow access to \"customers_profiles\". Only used by certain partners. If relevant to the partner and unset, defaults to `true`. */
    @field:JsonProperty("customers_profiles")
    val customersProfiles: kotlin.Boolean? = true

) : kotlin.collections.HashMap<String, kotlin.Any>()

