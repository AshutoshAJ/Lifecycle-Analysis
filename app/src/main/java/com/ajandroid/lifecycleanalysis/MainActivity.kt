package com.ajandroid.lifecycleanalysis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ajandroid.lifecycleanalysis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG = "LifecycleAnalysis"
    val name = "MainActivity"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate: $name")

        binding.button.setOnClickListener {
            startActivity(Intent(this, FragmentActivity::class.java))
        }
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