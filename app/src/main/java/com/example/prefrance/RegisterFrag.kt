package com.example.prefrance


import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.registerfrag.*

class RegisterFrag: Fragment(){

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(R.layout.registerfrag,container,false)

        var spf = activity!!.getSharedPreferences("techsum",Context.MODE_APPEND)
        var editor= spf.edit()
        editor.putString("uname",et_uname_regi.toString())
        editor.putString("pass",et_pass_rigi.toString())

        Toast.makeText(activity,"register succefully",Toast.LENGTH_SHORT).show()

        var fManager = activity!!.supportFragmentManager
        var tx= fManager.beginTransaction()
        tx.add(R.id.my_frame,LoginFrag())
        tx.commit()

        return view
    }

}