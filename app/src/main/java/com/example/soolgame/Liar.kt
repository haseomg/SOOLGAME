package com.example.soolgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class Liar : AppCompatActivity() {
    private var TAG = "[Liar Activity]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liar)
        Log.i(TAG, "onCreate : activity created.")

        initial()
    } // onCreate end

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart : activity started.")
    } // onStart end

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onStart : activity resumed.")
    } // onResume end

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause : activity pause.")
    } // onPause end

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onPause : activity stopped.")
    } // onStop end

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onPause : activity died.")
    } // onDestroy end

    fun initial() {
        setIntent()
        setBackBtn()
    } // initial method end

    fun setIntent() {
        if (intent.hasExtra("selectNum")) {
            var selectNum = intent.getIntExtra("selectNum", 0)
            Log.d(TAG, "selectNum : $selectNum")

        } else {
            Log.d(TAG, "intent has not Extra.")
        } // else end
    } // setIntent method end

    fun setBackBtn() {
        val backBtn: Button = findViewById(R.id.liarBackBtn)
        backBtn.setOnClickListener(View.OnClickListener {
            finish()
        }) // backBtn.setOnClickListener
    } // setBackBtn method end
} // CLASS end