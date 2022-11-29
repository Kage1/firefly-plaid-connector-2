package net.djvk.fireflyPlaidConnector2.lib

import net.djvk.fireflyPlaidConnector2.api.firefly.apis.FireflyTransactionSplitId
import net.djvk.fireflyPlaidConnector2.api.firefly.models.AccountTypeProperty
import net.djvk.fireflyPlaidConnector2.api.firefly.models.Transaction
import net.djvk.fireflyPlaidConnector2.api.firefly.models.TransactionSplit
import net.djvk.fireflyPlaidConnector2.api.firefly.models.TransactionTypeProperty

object FireflyFixtures {
    fun getTransaction(
        createdAt: java.time.OffsetDateTime? = null,
        updatedAt: java.time.OffsetDateTime? = null,
        user: String? = null,
        groupTitle: String? = null,
        type: TransactionTypeProperty = TransactionTypeProperty.withdrawal,
        date: java.time.OffsetDateTime = defaultOffsetNow,
        amount: String = "1111.22",
        description: String = "Test Firefly Transaction",
        sourceId: String? = null,
        destinationId: String? = null,
        transactionJournalId: FireflyTransactionSplitId? = null,
        order: Int? = 0,
        currencyId: String? = null,
        currencyCode: String? = null,
        currencySymbol: String? = null,
        currencyName: String? = null,
        currencyDecimalPlaces: Int? = null,
        foreignCurrencyId: String? = null,
        foreignCurrencyCode: String? = null,
        foreignCurrencySymbol: String? = null,
        foreignCurrencyDecimalPlaces: Int? = null,
        foreignAmount: String? = "0",
        sourceName: String? = null,
        sourceIban: String? = null,
        sourceType: AccountTypeProperty? = null,
        destinationName: String? = null,
        destinationIban: String? = null,
        destinationType: AccountTypeProperty? = null,
        budgetId: String? = null,
        budgetName: String? = null,
        categoryId: String? = null,
        categoryName: String? = null,
        billId: String? = null,
        billName: String? = null,
        reconciled: Boolean? = false,
        notes: String? = null,
        tags: List<String>? = listOf(),
        internalReference: String? = null,
        externalId: String? = null,
        externalUrl: String? = null,
        originalSource: String? = null,
        recurrenceId: Int? = null,
        recurrenceTotal: Int? = null,
        recurrenceCount: Int? = null,
        bunqPaymentId: String? = null,
        importHashV2: String? = null,
        sepaCc: String? = null,
        sepaCtOp: String? = null,
        sepaCtId: String? = null,
        sepaDb: String? = null,
        sepaCountry: String? = null,
        sepaEp: String? = null,
        sepaCi: String? = null,
        sepaBatchId: String? = null,
        interestDate: java.time.OffsetDateTime? = null,
        bookDate: java.time.OffsetDateTime? = null,
        processDate: java.time.OffsetDateTime? = null,
        dueDate: java.time.OffsetDateTime? = null,
        paymentDate: java.time.OffsetDateTime? = null,
        invoiceDate: java.time.OffsetDateTime? = null,
        latitude: Double? = null,
        longitude: Double? = null,
        zoomLevel: Int? = null,
        hasAttachments: Boolean? = null,
    ): Transaction {
        return Transaction(
            transactions = listOf(
                TransactionSplit(
                    type = type,
                    date = date,
                    amount = amount,
                    description = description,
                    sourceId = sourceId,
                    destinationId = destinationId,
                    transactionJournalId = transactionJournalId,
                    order = order,
                    currencyId = currencyId,
                    currencyCode = currencyCode,
                    currencySymbol = currencySymbol,
                    currencyName = currencyName,
                    currencyDecimalPlaces = currencyDecimalPlaces,
                    foreignCurrencyId = foreignCurrencyId,
                    foreignCurrencyCode = foreignCurrencyCode,
                    foreignCurrencySymbol = foreignCurrencySymbol,
                    foreignCurrencyDecimalPlaces = foreignCurrencyDecimalPlaces,
                    foreignAmount = foreignAmount,
                    sourceName = sourceName,
                    sourceIban = sourceIban,
                    sourceType = sourceType,
                    destinationName = destinationName,
                    destinationIban = destinationIban,
                    destinationType = destinationType,
                    budgetId = budgetId,
                    budgetName = budgetName,
                    categoryId = categoryId,
                    categoryName = categoryName,
                    billId = billId,
                    billName = billName,
                    reconciled = reconciled,
                    notes = notes,
                    tags = tags,
                    internalReference = internalReference,
                    externalId = externalId,
                    externalUrl = externalUrl,
                    originalSource = originalSource,
                    recurrenceId = recurrenceId,
                    recurrenceTotal = recurrenceTotal,
                    recurrenceCount = recurrenceCount,
                    bunqPaymentId = bunqPaymentId,
                    importHashV2 = importHashV2,
                    sepaCc = sepaCc,
                    sepaCtOp = sepaCtOp,
                    sepaCtId = sepaCtId,
                    sepaDb = sepaDb,
                    sepaCountry = sepaCountry,
                    sepaEp = sepaEp,
                    sepaCi = sepaCi,
                    sepaBatchId = sepaBatchId,
                    interestDate = interestDate,
                    bookDate = bookDate,
                    processDate = processDate,
                    dueDate = dueDate,
                    paymentDate = paymentDate,
                    invoiceDate = invoiceDate,
                    latitude = latitude,
                    longitude = longitude,
                    zoomLevel = zoomLevel,
                    hasAttachments = hasAttachments,
                )
            ),
            createdAt = createdAt,
            updatedAt = updatedAt,
            user = user,
            groupTitle = groupTitle,
        )
    }
}