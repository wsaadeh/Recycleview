package com.saadeh.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.saadeh.recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val adapter = ContactListAdapter()
        binding.rvList.adapter = adapter
        binding.rvList.layoutManager = LinearLayoutManager(this)
            //.apply { orientation = LinearLayoutManager.HORIZONTAL }
        adapter.submitList(contacts)
    }
}

val contacts = listOf(
    Contact(
        "Roque",
        "(55) 11 987479834",
        R.drawable.sample12
    ),
    Contact(
        "Bruna",
        "(55) 11 980809834",
        R.drawable.sample11
    ),
    Contact(
        "Brenda",
        "(55) 11 987472020",
        R.drawable.sample10
    ),
    Contact(
        "João",
        "(55) 11 985449834",
        R.drawable.sample9
    ),
    Contact(
        "André",
        "(55) 11 987479724",
        R.drawable.sample8
    ),
    Contact(
        "Deco",
        "(55) 11 987579534",
        R.drawable.sample7
    ),
    Contact(
        "Pedro",
        "(55) 11 986472834",
        R.drawable.sample6
    ),
    Contact(
        "Amanda",
        "(55) 11 987579944",
        R.drawable.sample5
    ),
    Contact(
        "Camila",
        "(55) 11 987589833",
        R.drawable.sample4
    ),
    Contact(
        "Rosana",
        "(55) 11 987469832",
        R.drawable.sample3
    ),
    Contact(
        "Janaina",
        "(55) 11 987479831",
        R.drawable.sample2
    ),
    Contact(
        "Joilson",
        "(55) 11 987472265",
        R.drawable.sample1
    ),
)