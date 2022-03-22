package com.kjy.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 설정 값 사용을 위해 PreferenceManager 불러오기
        val shared = PreferenceManager.getDefaultSharedPreferences(this)

        val checkBoxValue  = shared.getBoolean("key_add_shortcut", true)

    }
}