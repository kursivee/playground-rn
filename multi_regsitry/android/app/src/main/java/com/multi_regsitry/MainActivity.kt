package com.multi_regsitry

import android.app.FragmentManager.POP_BACK_STACK_INCLUSIVE
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.multi_regsitry.ui.app1.RnApp1Fragment
import com.multi_regsitry.ui.app2.RnApp2Fragment
import com.multi_regsitry.ui.native_1.Native1Fragment
import com.multi_regsitry.ui.native_2.Native2Fragment
import kotlinx.android.synthetic.main.main_activity.*
import java.util.*
import kotlin.collections.ArrayDeque

class MainActivity : AppCompatActivity(), DefaultHardwareBackBtnHandler, BottomNavigationView.OnNavigationItemSelectedListener {

    private val backStack: Stack<Int> = Stack()

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
                supportFragmentManager.popBackStack(null, POP_BACK_STACK_INCLUSIVE)
                backStack.clear()
                backStack.add(R.id.app_1)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, RnApp1Fragment.newInstance())
                    .commit()
            }
            R.id.app_2 -> {
                backStack.add(R.id.app_2)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, RnApp2Fragment.newInstance())
                    .addToBackStack("${R.id.app_2}")
                    .commit()
            }
            R.id.native_1 -> {
                backStack.add(R.id.native_1)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, Native1Fragment.newInstance())
                    .addToBackStack("${R.id.native_1}")
                    .commit()
            }
            R.id.native_2 -> {
                backStack.add(R.id.native_2)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, Native2Fragment.newInstance())
                    .addToBackStack("${R.id.native_2}")
                    .commit()
            }
            else -> return false
        }
        return true
    }

    override fun invokeDefaultOnBackPressed() {
        super.onBackPressed()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        with(supportFragmentManager) {
            val item = if(backStackEntryCount > 0) {
                getBackStackEntryAt(backStackEntryCount - 1).name!!.toInt()
            } else {
                R.id.app_1
            }
            bottomNavigationView.menu.findItem(item).isChecked = true
        }
    }
}