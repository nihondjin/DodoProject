package com.example.dodoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.dodoproject.databinding.ActivityMainBinding
import com.example.dodoproject.databinding.FragmentHomeBinding
import com.example.dodoproject.dodo.HomeFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            toolbarchikButton.setOnClickListener{
                findNavController(R.id.nav_host_fragment).navigate(R.id.profilFragment)
            }
        }
    }

}