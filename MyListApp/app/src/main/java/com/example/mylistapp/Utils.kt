package com.example.mylistapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

object Utils {

    fun createFragment(
        supportFragmentManager: FragmentManager?,
        fragment: Fragment?,
        container: Int
    ) {
        fragment?.let {
            supportFragmentManager
                ?.beginTransaction()
                ?.add(container, it, it.getClassName())
                ?.commit()
        }
    }

    fun Any.getClassName(): String {
        return this::class.java.simpleName
    }
}