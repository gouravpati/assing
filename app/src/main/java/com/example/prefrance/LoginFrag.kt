package com.example.prefrance

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.loginfrag.*

class LoginFrag:Fragment(){

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(R.layout.loginfrag,container,false)

        var spf = activity!!.getSharedPreferences("techsum",Context.MODE_APPEND)

        spf.getString("uname",et_uname_login.text.toString())
        spf.getString("pass", et_pass_login.text.toString())

        if (et_uname_login.equals("uname")&&et_pass_login.equals("pass")){

            var fManager = activity!!.supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.add(R.id.my_frame,LoginFrag())
            tx.commit()
        }else{

            Toast.makeText(activity,"invilid name and pass",Toast.LENGTH_LONG).show()

        }
        return view
    }


}