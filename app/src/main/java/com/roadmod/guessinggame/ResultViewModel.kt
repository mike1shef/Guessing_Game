package com.roadmod.guessinggame

import android.util.Log
import androidx.lifecycle.ViewModel

class ResultViewModel (finalResult : String): ViewModel() {
    val result = finalResult

    init {

    }


    override fun onCleared() {
        super.onCleared()
        Log.i("ResultViewModel", "View model cleared out")
    }
}