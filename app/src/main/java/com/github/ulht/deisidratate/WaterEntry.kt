package com.github.ulht.deisidratate

import java.util.Date

// data implementa o toString, equals e hashcode
data class WaterEntry(
  val drink: DrinkType,
  val amount: Int,
  val date: Date = Date(),
  val notes: String? = null,
)