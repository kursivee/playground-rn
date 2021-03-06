package com.multi_regsitry

import android.app.Activity
import android.app.Application
import android.content.Context
import com.facebook.react.*
import com.facebook.soloader.SoLoader
import com.multi_regsitry.react.ReactDelegateProvider
import java.lang.reflect.InvocationTargetException

class MainApplication: Application(), ReactApplication, ReactDelegateProvider<String> {

    private var app1Loaded = false
    private var app2Loaded = false

    private val reactNativeHost: ReactNativeHost = object : ReactNativeHost(this) {
        override fun getPackages(): MutableList<ReactPackage> {
            return PackageList(this).packages
        }

        override fun getUseDeveloperSupport(): Boolean {
            return BuildConfig.DEBUG
        }

        override fun getJSMainModuleName(): String {
            return "index"
        }
    }

    override fun getReactNativeHost(): ReactNativeHost {
        return reactNativeHost
    }

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this,  /* native exopackage */false)
        initializeFlipper(this, getReactNativeHost().reactInstanceManager)
    }

    private var app1: ReactDelegate? = null
    private var app2: ReactDelegate? = null

    override fun getReactDelegate(keySet: String, activity: Activity): ReactDelegate {
        return when(keySet) {
            "app1" -> app1 ?: ReactDelegate(activity, getReactNativeHost(), "App1", null).also {
                app1 = it
            }
            "app2" -> ReactDelegate(activity, getReactNativeHost(), "App2", null).also {
                app2 = it
            }
            else -> throw Exception("Invalid key")
        }
    }

    /**
     * Loads Flipper in React Native templates. Call this in the onCreate method with something like
     * initializeFlipper(this, getReactNativeHost().getReactInstanceManager());
     *
     * @param context
     * @param reactInstanceManager
     */
    private fun initializeFlipper(context: Context, reactInstanceManager: ReactInstanceManager) {
        if (BuildConfig.DEBUG) {
            try {
                /*
                 We use reflection here to pick up the class that initializes Flipper,
                since Flipper library is not available in release mode
                */
                val aClass = Class.forName("com.multi_regsitry.ReactNativeFlipper")
                aClass.getMethod("initializeFlipper", Context::class.java, ReactInstanceManager::class.java)
                        .invoke(null, context, reactInstanceManager)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            } catch (e: NoSuchMethodException) {
                e.printStackTrace()
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            } catch (e: InvocationTargetException) {
                e.printStackTrace()
            }
        }
    }
}