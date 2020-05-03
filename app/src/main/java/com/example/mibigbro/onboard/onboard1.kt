package com.example.mibigbro.onboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mibigbro.R
import kotlinx.android.synthetic.main.activity_onboard1.*


class onboard1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard1)

        buttonSig.setOnClickListener{goToOmboard2()}
    }

    private fun goToOmboard2()= startActivity(Intent(this, onboard2::class.java))
}
