package com.example.prefrance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginfrag)

        var fManager =supportFragmentManager
        var tx=fManager.beginTransaction()
        tx.add(R.id.my_frame,LoginFrag())
        tx.commit()

    }
}