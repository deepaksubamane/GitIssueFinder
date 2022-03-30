package com.example.gitissuefinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /***
         *
         * Big Conflict
         *
         * */
        /***
         * Comment added
         */

        // Added comment conflict
        showDialog()
        sub()
    }

    private fun sub() {
        TODO("Not yet implemented")
    }

    fun showDialog() {
        Log.e("ShowDialog","Displayed")
    }
}