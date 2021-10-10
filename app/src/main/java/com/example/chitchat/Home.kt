package com.example.chitchat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.chitchat.Extensions.navigate
import com.example.chitchat.databinding.HomeBinding

class Home : AppCompatActivity() {
    var binding: HomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.loginBtn?.setOnClickListener {
            navigateToLogin()
        }
    }

    fun navigateToLogin(){
        navigate(Login::class)
    }
}