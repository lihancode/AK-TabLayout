package com.lee.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName

    lateinit var fragments : ArrayList<Fragment>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragments = ArrayList()
        fragments.add(MondayFragment())
        fragments.add(ThursdayFragment())
        fragments.add(WednesdayFragment())
        mViewPager.adapter = ViewPagerFragmentAdapter(supportFragmentManager,fragments)
        tablayout.setupWithViewPager(mViewPager)
        tablayout.getTabAt(0)?.text = "Monday"
        tablayout.getTabAt(1)?.text = "Thursday"
        tablayout.getTabAt(2)?.text = "Wednesday"

    }

    private fun initFragments() {
        fragments = ArrayList()
        fragments.add(MondayFragment())
        fragments.add(ThursdayFragment())
        fragments.add(WednesdayFragment())
    }
}
