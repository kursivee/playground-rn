package com.multi_regsitry.ui.app1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.facebook.react.ReactDelegate
import com.facebook.react.ReactFragment
import com.multi_regsitry.react.MyReactFragment

class RnApp1Fragment : MyReactFragment() {

    companion object {
        fun newInstance() = RnApp1Fragment().apply {
            arguments = Bundle().apply {
                putString("arg_component_name", "app1")
            }
        }
    }
}