package apps.programmeranak.listsyourtodo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import apps.programmeranak.listsyourtodo.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            val pindah = Intent(this, MainActivity::class.java)
            startActivity(pindah)
            finish()
        }

        tv_buatDisini.setOnClickListener {
            val pindah = Intent(this, RegisterActivity::class.java)
            startActivity(pindah)
            finish()

        }
    }
}