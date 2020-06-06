package com.multi_regsitry.ui.app2

import android.os.Bundle
import com.multi_regsitry.react.MyReactFragment

class RnApp2Fragment : MyReactFragment() {

    companion object {
        fun newInstance() = RnApp2Fragment().apply {
            arguments = Bundle().apply {
                putString("arg_component_name", "app2")
            }
        }
    }
}