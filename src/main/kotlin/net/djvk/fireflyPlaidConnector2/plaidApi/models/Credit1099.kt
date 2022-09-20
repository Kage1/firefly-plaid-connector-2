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
 * An object representing an end user's 1099 tax form
 *
 * @param documentId An identifier of the document referenced by the document metadata.
 * @param documentMetadata
 * @param form1099Type
 * @param recipient
 * @param payer
 * @param filer
 * @param taxYear Tax year of the tax form.
 * @param rents Amount in rent by payer.
 * @param royalties Amount in royalties by payer.
 * @param otherIncome Amount in other income by payer.
 * @param federalIncomeTaxWithheld Amount of federal income tax withheld from payer.
 * @param fishingBoatProceeds Amount of fishing boat proceeds from payer.
 * @param medicalAndHealthcarePayments Amount of medical and healthcare payments from payer.
 * @param nonemployeeCompensation Amount of nonemployee compensation from payer.
 * @param substitutePaymentsInLieuOfDividendsOrInterest Amount of substitute payments made by payer.
 * @param payerMadeDirectSalesOf5000OrMoreOfConsumerProductsToBuyer Whether or not payer made direct sales over $5000 of consumer products.
 * @param cropInsuranceProceeds Amount of crop insurance proceeds.
 * @param excessGoldenParachutePayments Amount of golden parachute payments made by payer.
 * @param grossProceedsPaidToAnAttorney Amount of gross proceeds paid to an attorney by payer.
 * @param section409aDeferrals Amount of 409A deferrals earned by payer.
 * @param section409aIncome Amount of 409A income earned by payer.
 * @param stateTaxWithheld Amount of state tax withheld of payer for primary state.
 * @param stateTaxWithheldLower Amount of state tax withheld of payer for secondary state.
 * @param payerStateNumber Primary state ID.
 * @param payerStateNumberLower Secondary state ID.
 * @param stateIncome State income reported for primary state.
 * @param stateIncomeLower State income reported for secondary state.
 * @param transactionsReported One of the values will be provided Payment card Third party network
 * @param pseName Name of the PSE (Payment Settlement Entity).
 * @param pseTelephoneNumber Formatted (XXX) XXX-XXXX. Phone number of the PSE (Payment Settlement Entity).
 * @param grossAmount Gross amount reported.
 * @param cardNotPresentTransaction Amount in card not present transactions.
 * @param merchantCategoryCode Merchant category of filer.
 * @param numberOfPaymentTransactions Number of payment transactions made.
 * @param januaryAmount Amount reported for January.
 * @param februaryAmount Amount reported for February.
 * @param marchAmount Amount reported for March.
 * @param aprilAmount Amount reported for April.
 * @param mayAmount Amount reported for May.
 * @param juneAmount Amount reported for June.
 * @param julyAmount Amount reported for July.
 * @param augustAmount Amount reported for August.
 * @param septemberAmount Amount reported for September.
 * @param octoberAmount Amount reported for October.
 * @param novemberAmount Amount reported for November.
 * @param decemberAmount Amount reported for December.
 * @param primaryState Primary state of business.
 * @param secondaryState Secondary state of business.
 * @param primaryStateId Primary state ID.
 * @param secondaryStateId Secondary state ID.
 * @param primaryStateIncomeTax State income tax reported for primary state.
 * @param secondaryStateIncomeTax State income tax reported for secondary state.
 */

data class Credit1099(

    /* An identifier of the document referenced by the document metadata. */
    @field:JsonProperty("document_id")
    val documentId: kotlin.String?,

    @field:JsonProperty("document_metadata")
    val documentMetadata: CreditDocumentMetadata? = null,

    @field:JsonProperty("form_1099_type")
    val form1099Type: Form1099Type? = null,

    @field:JsonProperty("recipient")
    val recipient: Credit1099Recipient? = null,

    @field:JsonProperty("payer")
    val payer: Credit1099Payer? = null,

    @field:JsonProperty("filer")
    val filer: Credit1099Filer? = null,

    /* Tax year of the tax form. */
    @field:JsonProperty("tax_year")
    val taxYear: kotlin.String? = null,

    /* Amount in rent by payer. */
    @field:JsonProperty("rents")
    val rents: kotlin.Double? = null,

    /* Amount in royalties by payer. */
    @field:JsonProperty("royalties")
    val royalties: kotlin.Double? = null,

    /* Amount in other income by payer. */
    @field:JsonProperty("other_income")
    val otherIncome: kotlin.Double? = null,

    /* Amount of federal income tax withheld from payer. */
    @field:JsonProperty("federal_income_tax_withheld")
    val federalIncomeTaxWithheld: kotlin.Double? = null,

    /* Amount of fishing boat proceeds from payer. */
    @field:JsonProperty("fishing_boat_proceeds")
    val fishingBoatProceeds: kotlin.Double? = null,

    /* Amount of medical and healthcare payments from payer. */
    @field:JsonProperty("medical_and_healthcare_payments")
    val medicalAndHealthcarePayments: kotlin.Double? = null,

    /* Amount of nonemployee compensation from payer. */
    @field:JsonProperty("nonemployee_compensation")
    val nonemployeeCompensation: kotlin.Double? = null,

    /* Amount of substitute payments made by payer. */
    @field:JsonProperty("substitute_payments_in_lieu_of_dividends_or_interest")
    val substitutePaymentsInLieuOfDividendsOrInterest: kotlin.Double? = null,

    /* Whether or not payer made direct sales over $5000 of consumer products. */
    @field:JsonProperty("payer_made_direct_sales_of_5000_or_more_of_consumer_products_to_buyer")
    val payerMadeDirectSalesOf5000OrMoreOfConsumerProductsToBuyer: kotlin.String? = null,

    /* Amount of crop insurance proceeds. */
    @field:JsonProperty("crop_insurance_proceeds")
    val cropInsuranceProceeds: kotlin.Double? = null,

    /* Amount of golden parachute payments made by payer. */
    @field:JsonProperty("excess_golden_parachute_payments")
    val excessGoldenParachutePayments: kotlin.Double? = null,

    /* Amount of gross proceeds paid to an attorney by payer. */
    @field:JsonProperty("gross_proceeds_paid_to_an_attorney")
    val grossProceedsPaidToAnAttorney: kotlin.Double? = null,

    /* Amount of 409A deferrals earned by payer. */
    @field:JsonProperty("section_409a_deferrals")
    val section409aDeferrals: kotlin.Double? = null,

    /* Amount of 409A income earned by payer. */
    @field:JsonProperty("section_409a_income")
    val section409aIncome: kotlin.Double? = null,

    /* Amount of state tax withheld of payer for primary state. */
    @field:JsonProperty("state_tax_withheld")
    val stateTaxWithheld: kotlin.Double? = null,

    /* Amount of state tax withheld of payer for secondary state. */
    @field:JsonProperty("state_tax_withheld_lower")
    val stateTaxWithheldLower: kotlin.Double? = null,

    /* Primary state ID. */
    @field:JsonProperty("payer_state_number")
    val payerStateNumber: kotlin.String? = null,

    /* Secondary state ID. */
    @field:JsonProperty("payer_state_number_lower")
    val payerStateNumberLower: kotlin.String? = null,

    /* State income reported for primary state. */
    @field:JsonProperty("state_income")
    val stateIncome: kotlin.Double? = null,

    /* State income reported for secondary state. */
    @field:JsonProperty("state_income_lower")
    val stateIncomeLower: kotlin.Double? = null,

    /* One of the values will be provided Payment card Third party network */
    @field:JsonProperty("transactions_reported")
    val transactionsReported: kotlin.String? = null,

    /* Name of the PSE (Payment Settlement Entity). */
    @field:JsonProperty("pse_name")
    val pseName: kotlin.String? = null,

    /* Formatted (XXX) XXX-XXXX. Phone number of the PSE (Payment Settlement Entity). */
    @field:JsonProperty("pse_telephone_number")
    val pseTelephoneNumber: kotlin.String? = null,

    /* Gross amount reported. */
    @field:JsonProperty("gross_amount")
    val grossAmount: kotlin.Double? = null,

    /* Amount in card not present transactions. */
    @field:JsonProperty("card_not_present_transaction")
    val cardNotPresentTransaction: kotlin.Double? = null,

    /* Merchant category of filer. */
    @field:JsonProperty("merchant_category_code")
    val merchantCategoryCode: kotlin.String? = null,

    /* Number of payment transactions made. */
    @field:JsonProperty("number_of_payment_transactions")
    val numberOfPaymentTransactions: kotlin.String? = null,

    /* Amount reported for January. */
    @field:JsonProperty("january_amount")
    val januaryAmount: kotlin.Double? = null,

    /* Amount reported for February. */
    @field:JsonProperty("february_amount")
    val februaryAmount: kotlin.Double? = null,

    /* Amount reported for March. */
    @field:JsonProperty("march_amount")
    val marchAmount: kotlin.Double? = null,

    /* Amount reported for April. */
    @field:JsonProperty("april_amount")
    val aprilAmount: kotlin.Double? = null,

    /* Amount reported for May. */
    @field:JsonProperty("may_amount")
    val mayAmount: kotlin.Double? = null,

    /* Amount reported for June. */
    @field:JsonProperty("june_amount")
    val juneAmount: kotlin.Double? = null,

    /* Amount reported for July. */
    @field:JsonProperty("july_amount")
    val julyAmount: kotlin.Double? = null,

    /* Amount reported for August. */
    @field:JsonProperty("august_amount")
    val augustAmount: kotlin.Double? = null,

    /* Amount reported for September. */
    @field:JsonProperty("september_amount")
    val septemberAmount: kotlin.Double? = null,

    /* Amount reported for October. */
    @field:JsonProperty("october_amount")
    val octoberAmount: kotlin.Double? = null,

    /* Amount reported for November. */
    @field:JsonProperty("november_amount")
    val novemberAmount: kotlin.Double? = null,

    /* Amount reported for December. */
    @field:JsonProperty("december_amount")
    val decemberAmount: kotlin.Double? = null,

    /* Primary state of business. */
    @field:JsonProperty("primary_state")
    val primaryState: kotlin.String? = null,

    /* Secondary state of business. */
    @field:JsonProperty("secondary_state")
    val secondaryState: kotlin.String? = null,

    /* Primary state ID. */
    @field:JsonProperty("primary_state_id")
    val primaryStateId: kotlin.String? = null,

    /* Secondary state ID. */
    @field:JsonProperty("secondary_state_id")
    val secondaryStateId: kotlin.String? = null,

    /* State income tax reported for primary state. */
    @field:JsonProperty("primary_state_income_tax")
    val primaryStateIncomeTax: kotlin.Double? = null,

    /* State income tax reported for secondary state. */
    @field:JsonProperty("secondary_state_income_tax")
    val secondaryStateIncomeTax: kotlin.Double? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

