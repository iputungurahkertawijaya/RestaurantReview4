package com.example.restaurantreview4

import android.content.Context

open class Event <out T> (private val context: T){

    @Suppress("MemberVisibilityCanBePrivate")
    var hasBeenHandles = false
    private set


    fun getContentIfNotHandled(): T? {

        return  if (hasBeenHandles){

            null
        }else{
            hasBeenHandles = true
            context
        }
    }
}