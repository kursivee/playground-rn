package com.multi_regsitry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.multi_regsitry.ui.app1.RnApp1Fragment
import com.multi_regsitry.ui.app1.RnApp2Fragment
import com.multi_regsitry.ui.native_1.Native1Fragment
import com.multi_regsitry.ui.native_2.Native2Fragment
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity(), DefaultHardwareBackBtnHandler, BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, RnApp1Fragment.newInstance())
                    .commitNow()
        }
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.app_1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, RnApp1Fragment.newInstance())
                    .commitNow()
            }
            R.id.app_2 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, RnApp2Fragment.newInstance())
                    .commitNow()
            }
            R.id.native_1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, Native1Fragment.newInstance())
                    .commitNow()
            }
            R.id.native_2 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, Native2Fragment.newInstance())
                    .commitNow()
            }
            else -> return false
        }
        return true
    }

    override fun invokeDefaultOnBackPressed() {
        super.onBackPressed()
    }
}