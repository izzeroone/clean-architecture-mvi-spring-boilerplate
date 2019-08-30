package com.example.entity

import java.util.*

data class Book(
    val id: String,
    val title: String,
    val author: String,
    val publisher: String,
    val publishDate: Date
)