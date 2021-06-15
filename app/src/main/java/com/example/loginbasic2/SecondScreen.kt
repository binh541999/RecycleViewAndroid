package com.example.loginbasic2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.loginbasic2.models.AndroidVersion


class SecondScreen : AppCompatActivity() {
    private lateinit var listAndroidVersion: ArrayList<AndroidVersion>
    private lateinit var mRecycler: RecyclerView
    private lateinit var mAndroidAdapter: AndroidAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        var btn_back = findViewById<Button>(R.id.btn_back)
        btn_back.setOnClickListener {
            finish()
        }
        mRecycler = findViewById(R.id.rv_androidversion);
        listAndroidVersion = ArrayList<AndroidVersion>()
        for (i in 1..50) {
            listAndroidVersion.add(AndroidVersion("Version $i",1.1))
        }
        Log.d("Testname",listAndroidVersion.size.toString())
        mAndroidAdapter = AndroidAdapter(this, listAndroidVersion)
        mRecycler.setAdapter(mAndroidAdapter)
        mRecycler.setLayoutManager(LinearLayoutManager(baseContext,RecyclerView.VERTICAL,false))
        mAndroidAdapter.notifyDataSetChanged()
    }


}