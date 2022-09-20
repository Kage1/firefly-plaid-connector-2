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
 * @param name
 * @param `data`
 * @param createdAt
 * @param updatedAt
 */

data class Preference(

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("data")
    val `data`: PolymorphicProperty,

    @field:JsonProperty("created_at")
    val createdAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("updated_at")
    val updatedAt: java.time.OffsetDateTime? = null

)

