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
 * data, images, analysis, and results from the `documentary_verification` step.
 *
 * @param status The outcome status for the associated Identity Verification attempt's `documentary_verification` step. This field will always have the same value as `steps.documentary_verification`.
 * @param documents An array of documents submitted to the `documentary_verification` step. Each entry represents one user submission, where each submission will contain both a front and back image, or just a front image, depending on the document type.  Note: Plaid will automatically let a user submit a new set of document images up to three times if we detect that a previous attempt might have failed due to user error. For example, if the first set of document images are blurry or obscured by glare, the user will be asked to capture their documents again, resulting in at least two separate entries within `documents`. If the overall `documentary_verification` is `failed`, the user has exhausted their retry attempts.
 */

data class DocumentaryVerification(

    /* The outcome status for the associated Identity Verification attempt's `documentary_verification` step. This field will always have the same value as `steps.documentary_verification`. */
    @field:JsonProperty("status")
    val status: kotlin.String,

    /* An array of documents submitted to the `documentary_verification` step. Each entry represents one user submission, where each submission will contain both a front and back image, or just a front image, depending on the document type.  Note: Plaid will automatically let a user submit a new set of document images up to three times if we detect that a previous attempt might have failed due to user error. For example, if the first set of document images are blurry or obscured by glare, the user will be asked to capture their documents again, resulting in at least two separate entries within `documents`. If the overall `documentary_verification` is `failed`, the user has exhausted their retry attempts. */
    @field:JsonProperty("documents")
    val documents: kotlin.collections.List<DocumentaryVerificationDocument>

)

