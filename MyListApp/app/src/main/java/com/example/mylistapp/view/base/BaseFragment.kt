package com.example.mylistapp.view.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mylistapp.R
import com.example.mylistapp.Utils
import com.example.mylistapp.databinding.LayoutTodoListBinding
import com.example.mylistapp.view.category.CategoryFragment

class BaseFragment : Fragment() {

    var firstCategoryFragment: CategoryFragment? = null
    var secondCategoryFragment: CategoryFragment? = null
    var thirdCategoryFragment: CategoryFragment? = null
    var fourthCategoryFragment: CategoryFragment? = null

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

        initializeView()
    }

    private fun initializeView() {
        Utils.createFragment(
            activity?.supportFragmentManager,
            firstCategoryFragment,
            R.id.first_category
        )
        Utils.createFragment(
            activity?.supportFragmentManager,
            secondCategoryFragment,
            R.id.second_category
        )
        Utils.createFragment(
            activity?.supportFragmentManager,
            thirdCategoryFragment,
            R.id.third_category
        )
        Utils.createFragment(
            activity?.supportFragmentManager,
            fourthCategoryFragment,
            R.id.fourth_category
        )
    }
}