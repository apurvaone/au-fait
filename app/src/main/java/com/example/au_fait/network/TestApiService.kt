package com.example.au_fait.network

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://api.covidtracking.com/v1/us"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface TestApiService {
    @GET("daily.json")
    fun getProperties():
            Call<String>
}


object CovidApi {
    val retrofitService : TestApiService by lazy {
        retrofit.create(TestApiService::class.java) }
}