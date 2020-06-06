package com.multi_regsitry.react

import android.app.Activity
import com.facebook.react.ReactDelegate


interface ReactDelegateProvider<KeySet> {
    fun getReactDelegate(keySet: KeySet, activity: Activity): ReactDelegate
}