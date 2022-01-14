package com.example.au_fait.network

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

private const val BASE_URL ="https://cricket-live-data.p.rapidapi.com"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()


interface CricApiService {
    @Headers("x-rapidapi-host: cricket-live-data.p.rapidapi.com","x-rapidapi-key:7107a6ed7fmshf9f779648048aefp1eb428jsn8a9a781ab97c")
    @GET("match/2432999")
    fun getProperties():
            Call<String>
}


object CricetApi {
    val retrofitService : TestApiService by lazy {
        retrofit.create(TestApiService::class.java) }
}