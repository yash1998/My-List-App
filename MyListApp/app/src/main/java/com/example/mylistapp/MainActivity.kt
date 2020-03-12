package com.example.mylistapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylistapp.databinding.ActivityMainBinding
import com.example.mylistapp.view.base.BaseFragment

class MainActivity : AppCompatActivity() {

    private var activityMainBinding: ActivityMainBinding? = null
    private val baseFragment = BaseFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding?.root)

        // creating base fragment on main activity
        Utils.createFragment(supportFragmentManager, baseFragment, R.id.master_container)
    }
}
