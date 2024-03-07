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

package net.djvk.fireflyPlaidConnector2.api.plaid.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Information describing the intent of the transaction. Most relevant for personal finance use cases, but not limited to such use cases.  See the [`taxonomy csv file`](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) for a full list of personal finance categories.
 *
 * @param primary A high level category that communicates the broad category of the transaction.
 * @param detailed A granular category conveying the transaction's intent. This field can also be used as a unique identifier for the category.
 */

data class PersonalFinanceCategory(
    /* A high level category that communicates the broad category of the transaction. */
    @field:JsonProperty("primary")
    val primary: kotlin.String,

    /* A granular category conveying the transaction's intent. This field can also be used as a unique identifier for the category. */
    @field:JsonProperty("detailed")
    val detailed: kotlin.String
) : kotlin.collections.HashMap<String, kotlin.Any>() {
    constructor(enum: PersonalFinanceCategoryEnum) : this(enum.primary.name, enum.name)

    fun toEnum(): PersonalFinanceCategoryEnum {
        // Special case to handle what I believe is a Plaid bug I saw in the wild
        if (primary == PersonalFinanceCategoryEnum.Primary.TRAVEL.name &&
            detailed == PersonalFinanceCategoryEnum.TRANSPORTATION_PUBLIC_TRANSIT.name) {
            return PersonalFinanceCategoryEnum.TRANSPORTATION_PUBLIC_TRANSIT
        }
        // Business as usual
        return PersonalFinanceCategoryEnum.values().find {
            it.primary.name == primary && it.name == detailed
        }
            ?: throw IllegalArgumentException("Failed to convert personal finance category $this to enum")
    }
}

