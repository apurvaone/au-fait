package com.example.au_fait.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.example.au_fait.network.CricetApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel:ViewModel() {

    private val  _response= MutableLiveData<String>()



    val response: LiveData<String>
        get() = _response


    init {


        getCricetData()


    }

    private fun getCricetData() {

        _response.value=
            CricetApi.retrofitService.getProperties().enqueue(
            object: Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {

                    _response.value = response.body()
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    _response.value = "Failure: " + t.message
                }
            }).toString()
    }


}