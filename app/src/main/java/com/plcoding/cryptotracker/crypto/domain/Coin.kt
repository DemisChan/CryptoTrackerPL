package com.plcoding.cryptotracker.crypto.domain

data class Coin(
    val id: String,
    val name: String,
    val rank: Int,
    val priceUsd: Double,
    val marketCapUsd: Double,
    val symbol: String,
    val changePercent24Hr: Double,
)