package apps.programmeranak.listsyourtodo.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import apps.programmeranak.listsyourtodo.R
import apps.programmeranak.listsyourtodo.fragment.HomeFragment
import apps.programmeranak.listsyourtodo.fragment.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // kita set default nya Home Fragment
        loadFragment(HomeFragment())
        // inisialisasi BottomNavigaionView
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.btn_MainNavigationMenu)
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this)

    }

    private fun loadFragment(fragment: Fragment?): Boolean {
        if (fragment != null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.rootFragment, fragment)
                .commit()
            return true
        }
        return false
    }


    override fun onNavigationItemSelected(@NonNull menuItem: MenuItem): Boolean {
        var fragment: Fragment? = null
        when (menuItem.itemId) {
            R.id.home_menu -> fragment = HomeFragment()
            R.id.search_menu -> fragment = SearchFragment()
        }
        return loadFragment(fragment)
    }

}