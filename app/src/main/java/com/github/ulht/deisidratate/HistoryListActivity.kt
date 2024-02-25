package com.github.ulht.deisidratate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.github.ulht.deisidratate.databinding.ActivityHistoryListBinding

class HistoryListActivity : AppCompatActivity() {

  private lateinit var binding: ActivityHistoryListBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityHistoryListBinding.inflate(layoutInflater)
    setContentView(binding.root)
  }

  override fun onResume() {
    super.onResume()
    binding.buttonRegister.setOnClickListener {
      startActivity(Intent(this, RegisterActivity::class.java))
    }
  }

}