package com.multi_regsitry.ui.native_2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.multi_regsitry.R

class Native2Fragment : Fragment() {

    companion object {
        fun newInstance() = Native2Fragment()
    }

    private lateinit var viewModel: Native2ViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.native2_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Native2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}