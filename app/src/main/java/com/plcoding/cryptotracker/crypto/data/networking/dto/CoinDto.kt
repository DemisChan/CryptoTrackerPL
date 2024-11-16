package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinDto(
    val id: String,
    val name: String,
    val rank: Int,
    val priceUsd: Double,
    val marketCapUsd: Double,
    val symbol: String,
    val changePercent24Hr: Double,
)
