package com.endiel.newsapp.news_feature.domain.model

import com.endiel.newsapp.news_feature.data.remote.Source
import com.squareup.moshi.Json

data class News(
    val publishedAt: String? = null,
    val author: String? = null,
    val urlToImage: String? = null,
    val description: String? = null,
    val source: Source? = null,
    val title: String? = null,
    val url: String? = null,
    val content: String? = null
)