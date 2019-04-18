package edu.washington.vremaker.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    private val TAG ="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate event fired")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.e(TAG, "We're going down, Captain!")

    }
}
