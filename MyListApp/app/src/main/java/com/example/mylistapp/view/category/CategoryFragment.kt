package com.example.mylistapp.view.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mylistapp.databinding.LayoutSingleCategoryBinding

class CategoryFragment : Fragment() {

    var layoutSingleCategoryBinding: LayoutSingleCategoryBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        layoutSingleCategoryBinding =
            LayoutSingleCategoryBinding.inflate(inflater, container, false)
        return layoutSingleCategoryBinding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        layoutSingleCategoryBinding = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        layoutSingleCategoryBinding?.categoryTitleTextView?.text = ""

    }
}