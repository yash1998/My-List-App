package com.example.mylistapp.view.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mylistapp.databinding.LayoutTodoListBinding

class BaseFragment : Fragment() {

    private var layoutTodoListBinding: LayoutTodoListBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        layoutTodoListBinding = LayoutTodoListBinding.inflate(layoutInflater, container, false)
        return layoutTodoListBinding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        layoutTodoListBinding = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        layoutTodoListBinding?.hintTextView?.text = "Enter your phone no."
    }
}