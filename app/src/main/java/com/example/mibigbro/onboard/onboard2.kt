package com.example.mibigbro.onboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mibigbro.R
import kotlinx.android.synthetic.main.activity_onboard2.*

class onboard2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard2)


        buttonAnt2.setOnClickListener{goToOmboard1()}
        buttonSig2.setOnClickListener{goToOmboard3()}

    }

    private fun goToOmboard1()= startActivity(Intent(this, onboard1::class.java))

    private fun goToOmboard3()= startActivity(Intent(this, onboard3::class.java))
}
