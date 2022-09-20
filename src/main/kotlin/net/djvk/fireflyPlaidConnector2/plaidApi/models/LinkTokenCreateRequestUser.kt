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
 * An object specifying information about the end user who will be linking their account.
 *
 * @param clientUserId A unique ID representing the end user. Typically this will be a user ID number from your application. Personally identifiable information, such as an email address or phone number, should not be used in the `client_user_id`. It is currently used as a means of searching logs for the given user in the Plaid Dashboard.
 * @param legalName The user's full legal name. Currently used only to support certain legacy flows.
 * @param name
 * @param phoneNumber The user's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. This field is optional, but required to enable the [returning user experience](https://plaid.com/docs/link/returning-user).
 * @param phoneNumberVerifiedTime The date and time the phone number was verified in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDThh:mm:ssZ`). This field is optional, but required to enable any [returning user experience](https://plaid.com/docs/link/returning-user).   Only pass a verification time for a phone number that you have verified. If you have performed verification but don’t have the time, you may supply a signal value of the start of the UNIX epoch.   Example: `2020-01-01T00:00:00Z`
 * @param emailAddress The user's email address. This field is optional, but required to enable the [pre-authenticated returning user flow](https://plaid.com/docs/link/returning-user/#enabling-the-returning-user-experience).
 * @param emailAddressVerifiedTime The date and time the email address was verified in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDThh:mm:ssZ`). This is an optional field used in the [returning user experience](https://plaid.com/docs/link/returning-user).   Only pass a verification time for an email address that you have verified. If you have performed verification but don’t have the time, you may supply a signal value of the start of the UNIX epoch.   Example: `2020-01-01T00:00:00Z`
 * @param ssn To be provided in the format \"ddd-dd-dddd\". Not currently used.
 * @param dateOfBirth To be provided in the format \"yyyy-mm-dd\". Not currently used.
 * @param address
 * @param idNumber
 */

data class LinkTokenCreateRequestUser(

    /* A unique ID representing the end user. Typically this will be a user ID number from your application. Personally identifiable information, such as an email address or phone number, should not be used in the `client_user_id`. It is currently used as a means of searching logs for the given user in the Plaid Dashboard. */
    @field:JsonProperty("client_user_id")
    val clientUserId: kotlin.String,

    /* The user's full legal name. Currently used only to support certain legacy flows. */
    @field:JsonProperty("legal_name")
    @Deprecated(message = "This property is deprecated.")
    val legalName: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: LinkTokenCreateRequestUserName? = null,

    /* The user's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. This field is optional, but required to enable the [returning user experience](https://plaid.com/docs/link/returning-user). */
    @field:JsonProperty("phone_number")
    val phoneNumber: kotlin.String? = null,

    /* The date and time the phone number was verified in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDThh:mm:ssZ`). This field is optional, but required to enable any [returning user experience](https://plaid.com/docs/link/returning-user).   Only pass a verification time for a phone number that you have verified. If you have performed verification but don’t have the time, you may supply a signal value of the start of the UNIX epoch.   Example: `2020-01-01T00:00:00Z`  */
    @field:JsonProperty("phone_number_verified_time")
    val phoneNumberVerifiedTime: java.time.OffsetDateTime? = null,

    /* The user's email address. This field is optional, but required to enable the [pre-authenticated returning user flow](https://plaid.com/docs/link/returning-user/#enabling-the-returning-user-experience). */
    @field:JsonProperty("email_address")
    val emailAddress: kotlin.String? = null,

    /* The date and time the email address was verified in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDThh:mm:ssZ`). This is an optional field used in the [returning user experience](https://plaid.com/docs/link/returning-user).   Only pass a verification time for an email address that you have verified. If you have performed verification but don’t have the time, you may supply a signal value of the start of the UNIX epoch.   Example: `2020-01-01T00:00:00Z` */
    @field:JsonProperty("email_address_verified_time")
    val emailAddressVerifiedTime: java.time.OffsetDateTime? = null,

    /* To be provided in the format \"ddd-dd-dddd\". Not currently used. */
    @field:JsonProperty("ssn")
    @Deprecated(message = "This property is deprecated.")
    val ssn: kotlin.String? = null,

    /* To be provided in the format \"yyyy-mm-dd\". Not currently used. */
    @field:JsonProperty("date_of_birth")
    @Deprecated(message = "This property is deprecated.")
    val dateOfBirth: java.time.LocalDate? = null,

    @field:JsonProperty("address")
    val address: UserAddress? = null,

    @field:JsonProperty("id_number")
    val idNumber: UserIDNumber? = null

)

