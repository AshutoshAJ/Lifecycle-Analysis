package com.ajandroid.lifecycleanalysis

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlankFragment : Fragment() {

    val FTAG = "LifecycleAnalysis"
    val name = "BlankFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(FTAG, "onCreate: $name")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(FTAG, "onCreateView: $name")
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(FTAG, "onAttach: $name")
    }

    override fun onStart() {
        super.onStart()
        Log.d(FTAG, "onStart: $name")
    }

    override fun onResume() {
        super.onResume()
        Log.d(FTAG, "onResume: $name")
    }

    override fun onPause() {
        super.onPause()
        Log.d(FTAG, "onPause: $name")
    }

    override fun onStop() {
        super.onStop()
        Log.d(FTAG, "onStop: $name")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(FTAG, "onDestroyView: $name")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(FTAG, "onDestroy: $name")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(FTAG, "onDetach: $name")
    }

}