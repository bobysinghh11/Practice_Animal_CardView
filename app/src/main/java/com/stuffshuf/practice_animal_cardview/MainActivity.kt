package com.stuffshuf.practice_animal_cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val animals= getAllAnimal(10)

        rvText.layoutManager=GridLayoutManager(this,2,GridLayoutManager.VERTICAL, false)

        rvText.adapter=CustomAnimal(animals)
    }
}
