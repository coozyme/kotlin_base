package apps.programmeranak.listsyourtodo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import apps.programmeranak.listsyourtodo.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        tv_login.setOnClickListener {
            val pindah = Intent(this, LoginActivity::class.java)
            startActivity(pindah)
            finish()
        }
    }
}