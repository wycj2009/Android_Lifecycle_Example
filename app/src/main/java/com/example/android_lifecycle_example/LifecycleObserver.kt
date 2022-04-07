package com.example.android_lifecycle_example

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class LifecycleObserver : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d("myLog", "${owner.lifecycle.currentState}")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d("myLog", "${owner.lifecycle.currentState}")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d("myLog", "${owner.lifecycle.currentState}")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d("myLog", "${owner.lifecycle.currentState}")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d("myLog", "${owner.lifecycle.currentState}")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.d("myLog", "${owner.lifecycle.currentState}")
    }

}