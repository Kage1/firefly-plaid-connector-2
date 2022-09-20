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
 * Shorthand identifier for a specific screening list for individuals.
 *
 * Values: aUCON,cACON,eUCON,iZCIA,iZIPL,iZPEP,iZUNC,uKHMC,uSDPL,uSDTC,uSFBI,uSFSE,uSISN,uSMBC,uSPLC,uSSDN,uSSSI,sGSOF,tRTWL,tRDFD,tRFOR,tRWMD
 */

enum class IndividualWatchlistCode(val value: kotlin.String) {

    @JsonProperty(value = "AU_CON")
    aUCON("AU_CON"),

    @JsonProperty(value = "CA_CON")
    cACON("CA_CON"),

    @JsonProperty(value = "EU_CON")
    eUCON("EU_CON"),

    @JsonProperty(value = "IZ_CIA")
    iZCIA("IZ_CIA"),

    @JsonProperty(value = "IZ_IPL")
    iZIPL("IZ_IPL"),

    @JsonProperty(value = "IZ_PEP")
    iZPEP("IZ_PEP"),

    @JsonProperty(value = "IZ_UNC")
    iZUNC("IZ_UNC"),

    @JsonProperty(value = "UK_HMC")
    uKHMC("UK_HMC"),

    @JsonProperty(value = "US_DPL")
    uSDPL("US_DPL"),

    @JsonProperty(value = "US_DTC")
    uSDTC("US_DTC"),

    @JsonProperty(value = "US_FBI")
    uSFBI("US_FBI"),

    @JsonProperty(value = "US_FSE")
    uSFSE("US_FSE"),

    @JsonProperty(value = "US_ISN")
    uSISN("US_ISN"),

    @JsonProperty(value = "US_MBC")
    uSMBC("US_MBC"),

    @JsonProperty(value = "US_PLC")
    uSPLC("US_PLC"),

    @JsonProperty(value = "US_SDN")
    uSSDN("US_SDN"),

    @JsonProperty(value = "US_SSI")
    uSSSI("US_SSI"),

    @JsonProperty(value = "SG_SOF")
    sGSOF("SG_SOF"),

    @JsonProperty(value = "TR_TWL")
    tRTWL("TR_TWL"),

    @JsonProperty(value = "TR_DFD")
    tRDFD("TR_DFD"),

    @JsonProperty(value = "TR_FOR")
    tRFOR("TR_FOR"),

    @JsonProperty(value = "TR_WMD")
    tRWMD("TR_WMD");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is IndividualWatchlistCode) "$data" else null

        /**
         * Returns a valid [IndividualWatchlistCode] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): IndividualWatchlistCode? = data?.let {
            val normalizedData = "$it".lowercase()
            values().firstOrNull { value ->
                it == value || normalizedData == "$value".lowercase()
            }
        }
    }
}

