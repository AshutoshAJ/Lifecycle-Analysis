package com.ajandroid.lifecycleanalysis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class FragmentActivity : AppCompatActivity() {

    val TAG = "LifecycleAnalysis"
    val name = "FragmentActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d(TAG, "onCreate: $name")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: $name")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: $name")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: $name")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: $name")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: $name")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: $name")
    }
}