package com.example.mylistapp.viewmodel

import androidx.lifecycle.MutableLiveData

class SingleCategoryViewModel {

    var taskCountSuccessResponse: MutableLiveData<String>? = null
    var taskCountErrorResponse: MutableLiveData<String>? = null
}