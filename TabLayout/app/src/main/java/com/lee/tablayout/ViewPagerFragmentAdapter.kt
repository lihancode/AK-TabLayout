package com.lee.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class ViewPagerFragmentAdapter(val fm : FragmentManager , val fragments : ArrayList<Fragment>)  : FragmentPagerAdapter(fm){
    override fun getItem(position: Int) = fragments[position]
    override fun getCount() = fragments.size

}