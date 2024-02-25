package com.github.ulht.deisidratate

import java.text.SimpleDateFormat
import java.util.Date

object EntriesBook {

  private val entries = mutableListOf<WaterEntry>()

  fun insert(entry: WaterEntry) {
    entries.add(entry)
  }

  fun getAll() = entries
}