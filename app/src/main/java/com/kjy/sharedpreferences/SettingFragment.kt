package com.kjy.sharedpreferences

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat


// PreferenceFragmentCompat 추상 클래스를 상속 받음
// onCreatePreferences() 메서드 오버라이드
class SettingFragment: PreferenceFragmentCompat (){
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        // addPreferencesFromResource 호출하여 preference 파일을 파라미터로 전달하면 설정 항목에 대한 View가 자동 생성
        addPreferencesFromResource(R.xml.preferences)

    }
}