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

open class CategoriesApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonBlock: ObjectMapper.() -> Unit = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonBlock) {

    /**
     * Delete a category.
     * Delete a category. Transactions will not be removed.
     * @param id The ID of the category.
     * @return void
     */
    open suspend fun deleteCategory(id: kotlin.String): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/api/v1/categories/{id}".replace("{" + "id" + "}", "$id"),
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
     * Get a single category.
     * Get a single category.
     * @param id The ID of the category.
     * @param start A date formatted YYYY-MM-DD, to show spent and earned info.  (optional)
     * @param end A date formatted YYYY-MM-DD, to show spent and earned info.  (optional)
     * @return CategorySingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCategory(
        id: kotlin.String,
        start: java.time.LocalDate?,
        end: java.time.LocalDate?
    ): HttpResponse<CategorySingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        start?.apply { localVariableQuery["start"] = listOf("$start") }
        end?.apply { localVariableQuery["end"] = listOf("$end") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/categories/{id}".replace("{" + "id" + "}", "$id"),
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
     * Lists all attachments.
     * Lists all attachments.
     * @param id The ID of the category.
     * @param page Page number. The default pagination is 50. (optional)
     * @return AttachmentArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listAttachmentByCategory(id: kotlin.String, page: kotlin.Int?): HttpResponse<AttachmentArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        page?.apply { localVariableQuery["page"] = listOf("$page") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/categories/{id}/attachments".replace("{" + "id" + "}", "$id"),
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
     * List all categories.
     * List all categories.
     * @param page Page number. The default pagination is 50. (optional)
     * @return CategoryArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listCategory(page: kotlin.Int?): HttpResponse<CategoryArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        page?.apply { localVariableQuery["page"] = listOf("$page") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/categories",
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
     * List all transactions in a category.
     * List all transactions in a category, optionally limited to the date ranges specified.
     * @param id The ID of the category.
     * @param page Page number. The default pagination is per 50. (optional)
     * @param start A date formatted YYYY-MM-DD, to limit the result list.  (optional)
     * @param end A date formatted YYYY-MM-DD, to limit the result list.  (optional)
     * @param type Optional filter on the transaction type(s) returned (optional)
     * @return TransactionArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listTransactionByCategory(
        id: kotlin.String,
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
            "/api/v1/categories/{id}/transactions".replace("{" + "id" + "}", "$id"),
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
     * All transactions without a category.
     * Get all transactions without a category, possibly limited by start and end
     * @param limit Limits the number of results on one page. (optional)
     * @param page Page number. The default pagination is 50. (optional)
     * @param start A date formatted YYYY-MM-DD.  (optional)
     * @param end A date formatted YYYY-MM-DD.  (optional)
     * @param type Optional filter on the transaction type(s) returned (optional)
     * @return TransactionArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listTransactionWithoutCategory(
        limit: kotlin.Int?,
        page: kotlin.Int?,
        start: java.time.LocalDate?,
        end: java.time.LocalDate?,
        type: TransactionTypeFilter?
    ): HttpResponse<TransactionArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        limit?.apply { localVariableQuery["limit"] = listOf("$limit") }
        page?.apply { localVariableQuery["page"] = listOf("$page") }
        start?.apply { localVariableQuery["start"] = listOf("$start") }
        end?.apply { localVariableQuery["end"] = listOf("$end") }
        type?.apply { localVariableQuery["type"] = listOf("$type") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/categories/transactions-without-category",
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
     * Store a new category
     * Creates a new category. The data required can be submitted as a JSON body or as a list of parameters.
     * @param category JSON array or key&#x3D;value pairs with the necessary category information. See the model for the exact specifications.
     * @return CategorySingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun storeCategory(category: Category): HttpResponse<CategorySingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody = category

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/api/v1/categories",
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
     * Update existing category.
     * Update existing category.
     * @param id The ID of the category.
     * @param categoryUpdate JSON array with updated category information. See the model for the exact specifications.
     * @return CategorySingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun updateCategory(id: kotlin.String, categoryUpdate: CategoryUpdate): HttpResponse<CategorySingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody = categoryUpdate

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/api/v1/categories/{id}".replace("{" + "id" + "}", "$id"),
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
