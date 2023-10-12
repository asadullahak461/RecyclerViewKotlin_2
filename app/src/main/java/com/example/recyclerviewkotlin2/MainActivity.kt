package com.example.recyclerviewkotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Contacts>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.a,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.a,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g
        )
        heading = arrayOf(
            "Asad Khan",
            "Hamza",
            "Ali",
            "Shehroz",
            "Wajahat",
            "Adil",
            "Asad Khan",
            "Hamza",
            "Ali",
            "Shehroz",
            "Wajahat",
            "Adil",
            "Asad Khan",
            "Hamza",
            "Ali",
            "Shehroz",
            "Wajahat",
            "Adil"
        )
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Contacts>()
        getUserData()
    }

    private fun getUserData() {

        for (i in imageId.indices){

            val contacts = Contacts(imageId[i],heading[i])
            newArrayList.add(contacts)
        }

        recyclerView.adapter = CustomAdapter(newArrayList)
    }
}