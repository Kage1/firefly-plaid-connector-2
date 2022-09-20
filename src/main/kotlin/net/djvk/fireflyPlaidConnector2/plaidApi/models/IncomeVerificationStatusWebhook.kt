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
 * Fired when the status of an income verification instance has changed. It will typically take several minutes for this webhook to fire after the end user has uploaded their documents in the Document Income flow.
 *
 * @param webhookType `\"INCOME\"`
 * @param webhookCode `INCOME_VERIFICATION`
 * @param itemId The Item ID associated with the verification.
 * @param verificationStatus `VERIFICATION_STATUS_PROCESSING_COMPLETE`: The income verification status processing has completed. If the user uploaded multiple documents, this webhook will fire when all documents have finished processing. Call the `/income/verification/paystubs/get` endpoint and check the document metadata to see which documents were successfully parsed.  `VERIFICATION_STATUS_PROCESSING_FAILED`: A failure occurred when attempting to process the verification documentation.  `VERIFICATION_STATUS_PENDING_APPROVAL`: The income verification has been sent to the user for review.
 * @param userId The Plaid `user_id` of the User associated with this webhook, warning, or error.
 */

data class IncomeVerificationStatusWebhook(

    /* `\"INCOME\"` */
    @field:JsonProperty("webhook_type")
    val webhookType: kotlin.String,

    /* `INCOME_VERIFICATION` */
    @field:JsonProperty("webhook_code")
    val webhookCode: kotlin.String,

    /* The Item ID associated with the verification. */
    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    /* `VERIFICATION_STATUS_PROCESSING_COMPLETE`: The income verification status processing has completed. If the user uploaded multiple documents, this webhook will fire when all documents have finished processing. Call the `/income/verification/paystubs/get` endpoint and check the document metadata to see which documents were successfully parsed.  `VERIFICATION_STATUS_PROCESSING_FAILED`: A failure occurred when attempting to process the verification documentation.  `VERIFICATION_STATUS_PENDING_APPROVAL`: The income verification has been sent to the user for review. */
    @field:JsonProperty("verification_status")
    val verificationStatus: kotlin.String,

    /* The Plaid `user_id` of the User associated with this webhook, warning, or error. */
    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

