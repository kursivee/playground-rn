package com.multi_regsitry.ui.login

import android.os.Bundle
import com.facebook.react.ReactFragment

class RnLoginFragment : ReactFragment() {

    companion object {
        fun newInstance() = RnLoginFragment().apply {
            arguments = Bundle().apply {
                putString("arg_component_name", "App1")
            }
        }
    }
}