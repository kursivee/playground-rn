package com.multi_regsitry.ui.app1

import android.os.Bundle
import com.facebook.react.ReactFragment

class RnApp2Fragment : ReactFragment() {

    companion object {
        fun newInstance() = RnApp2Fragment().apply {
            arguments = Bundle().apply {
                putString("arg_component_name", "App2")
            }
        }
    }
}