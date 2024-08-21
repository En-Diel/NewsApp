package com.endiel.newsapp.news_feature.domain.repository

import com.endiel.newsapp.news_feature.common.Resource
import com.endiel.newsapp.news_feature.data.remote.NewsDto

interface NewsRepository {
    suspend fun getNews(): List<NewsDto>
}