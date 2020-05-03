package com.example.mibigbro.onboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mibigbro.R
import kotlinx.android.synthetic.main.activity_onboard3.*

class onboard3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard3)

        buttonAnt3.setOnClickListener{goToOmboard2()}
        buttonSig3.setOnClickListener{goTologin()}
    }

    private fun goToOmboard2()= startActivity(Intent(this, onboard2::class.java))

    private fun goTologin()= startActivity(Intent(this, onboard3::class.java))
}
