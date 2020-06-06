package com.multi_regsitry.react

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.facebook.react.ReactDelegate

abstract class MyReactFragment : Fragment() {
    protected lateinit var reactDelegate: ReactDelegate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        reactDelegate = (requireActivity().application as ReactDelegateProvider<String>)
                .getReactDelegate(arguments!!.getString("arg_component_name")!!, requireActivity())
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        runCatching {
            // Attempt to load the app. If app has already been loaded then it will throw an Exception.
            // Should be good to just catch the exception and do nothing since this is the behavior we want
            reactDelegate.loadApp()
        }
        return reactDelegate.reactRootView
    }

    override fun onResume() {
        super.onResume()
        reactDelegate.onHostResume()
    }

    override fun onPause() {
        super.onPause()
        reactDelegate.onHostPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        reactDelegate.onHostDestroy()
    }

}