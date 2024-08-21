package com.endiel.newsapp.news_feature.data.remote

import retrofit2.http.GET

interface NewsApi {
    @GET("https://newsapi.org/v2/")
    suspend fun getNews(): List<NewsDto> // Returns the NewsDto
}