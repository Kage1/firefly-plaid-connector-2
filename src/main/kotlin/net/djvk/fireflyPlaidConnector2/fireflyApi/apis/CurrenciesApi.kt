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

package net.djvk.fireflyPlaidConnector2.fireflyApi.apis

import com.fasterxml.jackson.databind.ObjectMapper
import io.ktor.client.*
import io.ktor.client.engine.*
import net.djvk.fireflyPlaidConnector2.fireflyApi.infrastructure.*
import net.djvk.fireflyPlaidConnector2.fireflyApi.models.*

open class CurrenciesApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonBlock: ObjectMapper.() -> Unit = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonBlock) {

    /**
     * Make currency default currency.
     * Make this currency the default currency for the user. If the currency is not enabled, it will be enabled as well.
     * @param code The currency code.
     * @return CurrencySingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun defaultCurrency(code: kotlin.String): HttpResponse<CurrencySingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/api/v1/currencies/{code}/default".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Delete a currency.
     * Delete a currency.
     * @param code The currency code.
     * @return void
     */
    open suspend fun deleteCurrency(code: kotlin.String): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/api/v1/currencies/{code}".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Disable a currency.
     * Disable a currency.
     * @param code The currency code.
     * @return CurrencySingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun disableCurrency(code: kotlin.Int): HttpResponse<CurrencySingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/api/v1/currencies/{code}/disable".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Enable a single currency.
     * Enable a single currency.
     * @param code The currency code.
     * @return CurrencySingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun enableCurrency(code: kotlin.String): HttpResponse<CurrencySingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/api/v1/currencies/{code}/enable".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Get a single currency.
     * Get a single currency.
     * @param code The currency code.
     * @return CurrencySingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCurrency(code: kotlin.String): HttpResponse<CurrencySingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/currencies/{code}".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Get the user&#39;s default currency.
     * Get the user&#39;s default currency.
     * @return CurrencySingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getDefaultCurrency(): HttpResponse<CurrencySingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/currencies/default",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * List all accounts with this currency.
     * List all accounts with this currency.
     * @param code The currency code.
     * @param page Page number. The default pagination is 50. (optional)
     * @param date A date formatted YYYY-MM-DD. When added to the request, Firefly III will show the account&#39;s balance on that day.  (optional)
     * @param type Optional filter on the account type(s) returned (optional)
     * @return AccountArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listAccountByCurrency(
        code: kotlin.String,
        page: kotlin.Int?,
        date: java.time.LocalDate?,
        type: AccountTypeFilter?
    ): HttpResponse<AccountArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        page?.apply { localVariableQuery["page"] = listOf("$page") }
        date?.apply { localVariableQuery["date"] = listOf("$date") }
        type?.apply { localVariableQuery["type"] = listOf("$type") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/currencies/{code}/accounts".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * List all available budgets with this currency.
     * List all available budgets with this currency.
     * @param code The currency code.
     * @param page Page number. The default pagination is 50 (optional)
     * @return AvailableBudgetArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listAvailableBudgetByCurrency(
        code: kotlin.String,
        page: kotlin.Int?
    ): HttpResponse<AvailableBudgetArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        page?.apply { localVariableQuery["page"] = listOf("$page") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/currencies/{code}/available_budgets".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * List all bills with this currency.
     * List all bills with this currency.
     * @param code The currency code.
     * @param page Page number. The default pagination is 50. (optional)
     * @return BillArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listBillByCurrency(code: kotlin.String, page: kotlin.Int?): HttpResponse<BillArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        page?.apply { localVariableQuery["page"] = listOf("$page") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/currencies/{code}/bills".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * List all budget limits with this currency
     * List all budget limits with this currency
     * @param code The currency code.
     * @param page Page number. The default pagination is 50. (optional)
     * @param start Start date for the budget limit list. (optional)
     * @param end End date for the budget limit list. (optional)
     * @return BudgetLimitArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listBudgetLimitByCurrency(
        code: kotlin.String,
        page: kotlin.Int?,
        start: java.time.LocalDate?,
        end: java.time.LocalDate?
    ): HttpResponse<BudgetLimitArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        page?.apply { localVariableQuery["page"] = listOf("$page") }
        start?.apply { localVariableQuery["start"] = listOf("$start") }
        end?.apply { localVariableQuery["end"] = listOf("$end") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/currencies/{code}/budget_limits".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * List all currencies.
     * List all currencies.
     * @param page Page number. The default pagination is 50. (optional)
     * @return CurrencyArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listCurrency(page: kotlin.Int?): HttpResponse<CurrencyArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        page?.apply { localVariableQuery["page"] = listOf("$page") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/currencies",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * List all recurring transactions with this currency.
     * List all recurring transactions with this currency.
     * @param code The currency code.
     * @param page Page number. The default pagination is 50. (optional)
     * @return RecurrenceArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listRecurrenceByCurrency(code: kotlin.String, page: kotlin.Int?): HttpResponse<RecurrenceArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        page?.apply { localVariableQuery["page"] = listOf("$page") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/currencies/{code}/recurrences".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * List all rules with this currency.
     * List all rules with this currency.
     * @param code The currency code.
     * @param page Page number. The default pagination per 50. (optional)
     * @return RuleArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listRuleByCurrency(code: kotlin.String, page: kotlin.Int?): HttpResponse<RuleArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        page?.apply { localVariableQuery["page"] = listOf("$page") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/currencies/{code}/rules".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * List all transactions with this currency.
     * List all transactions with this currency.
     * @param code The currency code.
     * @param page Page number. The default pagination is per 50. (optional)
     * @param start A date formatted YYYY-MM-DD, to limit the list of transactions.  (optional)
     * @param end A date formatted YYYY-MM-DD, to limit the list of transactions.  (optional)
     * @param type Optional filter on the transaction type(s) returned (optional)
     * @return TransactionArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listTransactionByCurrency(
        code: kotlin.String,
        page: kotlin.Int?,
        start: java.time.LocalDate?,
        end: java.time.LocalDate?,
        type: TransactionTypeFilter?
    ): HttpResponse<TransactionArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        page?.apply { localVariableQuery["page"] = listOf("$page") }
        start?.apply { localVariableQuery["start"] = listOf("$start") }
        end?.apply { localVariableQuery["end"] = listOf("$end") }
        type?.apply { localVariableQuery["type"] = listOf("$type") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/currencies/{code}/transactions".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Store a new currency
     * Creates a new currency. The data required can be submitted as a JSON body or as a list of parameters.
     * @param currencyStore JSON array or key&#x3D;value pairs with the necessary currency information. See the model for the exact specifications.
     * @return CurrencySingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun storeCurrency(currencyStore: CurrencyStore): HttpResponse<CurrencySingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody = currencyStore

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/api/v1/currencies",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Update existing currency.
     * Update existing currency.
     * @param code The currency code.
     * @param currencyUpdate JSON array with updated currency information. See the model for the exact specifications.
     * @return CurrencySingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun updateCurrency(code: kotlin.String, currencyUpdate: CurrencyUpdate): HttpResponse<CurrencySingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody = currencyUpdate

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/api/v1/currencies/{code}".replace("{" + "code" + "}", "$code"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

}
