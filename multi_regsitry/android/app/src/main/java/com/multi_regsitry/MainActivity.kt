package com.multi_regsitry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
import com.multi_regsitry.ui.login.RnLoginFragment

class MainActivity : AppCompatActivity(), DefaultHardwareBackBtnHandler {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, RnLoginFragment.newInstance())
                    .commitNow()
        }
    }

    override fun invokeDefaultOnBackPressed() {
        super.onBackPressed()
    }
}