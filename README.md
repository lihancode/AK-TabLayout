# AK-TabLayout
Android Kotlin TabLayout with ViewPager


# Layout 
```
   <?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">
      <com.google.android.material.tabs.TabLayout
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            app:layout_constraintTop_toTopOf="parent" app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent" android:id="@+id/tablayout">

    </com.google.android.material.tabs.TabLayout>
    <androidx.viewpager.widget.ViewPager
            android:layout_width="0dp"
            android:layout_height="0dp"
            app:layout_constraintTop_toBottomOf="@+id/tablayout" app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintBottom_toBottomOf="parent" app:layout_constraintEnd_toEndOf="parent"
            android:id="@+id/mViewPager"/>
    </androidx.constraintlayout.widget.ConstraintLayout>

```
# Main

```
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

```

# ViewPagerAdapter

```
class ViewPagerFragmentAdapter(val fm : FragmentManager , val fragments : ArrayList<Fragment>)  : FragmentPagerAdapter(fm){
    override fun getItem(position: Int) = fragments[position]
    override fun getCount() = fragments.size

}

```


# Result

<img  src="https://github.com/lihancode/AK-TabLayout/blob/master/Screenshot_1562743949.png"  height =300 width=300 ></img>
  
  
<img  src="https://github.com/lihancode/AK-TabLayout/blob/master/tablayout.gif"  height =300 width=300 ></img>








