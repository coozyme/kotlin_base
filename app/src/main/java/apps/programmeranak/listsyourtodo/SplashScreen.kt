package apps.programmeranak.listsyourtodo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import apps.programmeranak.listsyourtodo.activity.LoginActivity
import apps.programmeranak.listsyourtodo.activity.MainActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val mHandler = Handler()

        mHandler.postDelayed(
        {
            val pindah = Intent(this, LoginActivity::class.java)
            startActivity(pindah)
            finish()
        }, 1000)
    }
}