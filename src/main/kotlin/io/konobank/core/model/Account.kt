package io.konobank.core.model

data class Account(
    val id: String,
    val balance: Long,
    val creditLimit: Long,
    val currencyCode: Int,
    val cashbackType: CashbackType
)