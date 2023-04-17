package com.example.a3_add_two_num

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addBTN.setOnClickListener {
            if(no1ET.text.toString() != "" && no2ET.text.toString() !="") {
                var ans = no1ET.text.toString().toInt() + no2ET.text.toString().toInt()
                ansTV.text = ans.toString()
                ansET.setText(ans.toString())
            }
            else
            {
                Toast.makeText(this,"Enter both the numbers",Toast.LENGTH_LONG).show()
            }


        }

    }
}