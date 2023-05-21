package com.example.clase6fragmentsbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity()
    {
        private lateinit var floatingButton: FloatingActionButton
        private var isModoLight: Boolean = true
        override fun onCreate(savedInstanceState: Bundle?)
        {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            floatingButton = findViewById(R.id.floatingActionButton)
           // supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,BlankFragment()).commit()

            floatingButton.setOnClickListener{
                if (isModoLight)
                    {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainerView, DarkFragment()).commit()
                    }
                else
                    {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainerView, BlankFragment()).commit()
                    }

                isModoLight = !isModoLight
            }
        }
    }