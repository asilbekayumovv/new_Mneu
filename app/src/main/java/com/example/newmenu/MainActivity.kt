package com.example.newmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.newmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId){
            R.id.menu1 -> binding.fragmentContainerView.findNavController().navigate(R.id.action_homeFragment_to_cabinetFragment)
            R.id.menu2 -> Toast.makeText(this, "Siuu", Toast.LENGTH_SHORT).show()


        }


        return super.onOptionsItemSelected(item)
    }

}