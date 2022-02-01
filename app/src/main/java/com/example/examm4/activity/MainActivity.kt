package com.example.examm4.activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.examm4.R
import com.example.examm4.adapter.CustomAdapter
import com.example.examm4.model.Member
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        refershAdapter(memberList())

    }

    private fun initViews() {
        recycleview.layoutManager = GridLayoutManager(this, 1)
    }

    fun refershAdapter(members: List<Member>) {
        val adapter = CustomAdapter(members)
        recycleview.adapter = adapter
    }

    fun memberList(): List<Member> {
        val members = ArrayList<Member>()
        for (i in 0..100) {
           members.add(Member())
        }
        return members

    }
}