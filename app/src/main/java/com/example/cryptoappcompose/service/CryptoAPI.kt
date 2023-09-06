package com.example.cryptoappcompose.service

import com.example.cryptoappcompose.model.Crypto
import com.example.cryptoappcompose.model.CryptoList
import retrofit2.http.GET

interface CryptoAPI {

    //https://raw.githubusercontent.com/atilsamancioglu/IA32-CryptoComposeData/main/cryptolist.json
    //https://raw.githubusercontent.com/atilsamancioglu/IA32-CryptoComposeData/main/crypto.json

    @GET("atilsamancioglu/IA32-CryptoComposeData/main/cryptolist.json")
    suspend fun getCryptoList() : CryptoList

    @GET("atilsamancioglu/IA32-CryptoComposeData/main/crypto.json")
    suspend fun getCrypto() : Crypto


}