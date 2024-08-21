package com.endiel.newsapp.news_feature.domain.news

import java.time.LocalDateTime

// Data object that we'll use after mapping it with our Dto(Data Transfer Object)
data class NewsData(
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: LocalDateTime,
    val content: String
)
