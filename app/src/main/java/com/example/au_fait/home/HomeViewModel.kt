package com.example.au_fait.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel:ViewModel() {

    private val  _response= MutableLiveData<String>()



    val response: LiveData<String>
        get() = _response


    init {


        getCricetData()



    }

    private fun getCricetData() {
        _response.value="Set the data"
    }


}