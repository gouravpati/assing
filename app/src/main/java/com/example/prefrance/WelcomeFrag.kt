package com.example.prefrance

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.loginfrag.*
import kotlinx.android.synthetic.main.welcome.*

class WelcomeFrag: Fragment(){

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(R.layout.welcome,container,false)

        var spf = activity!!.getSharedPreferences("techsome",Context.MODE_APPEND)

        var uname = spf.getString("uname",et_uname_login.text.toString())

        textview.text="welcome here &uname"



        return view
    }

}