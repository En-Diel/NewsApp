package com.endiel.newsapp.news_feature.data.repository

import com.endiel.newsapp.news_feature.data.remote.NewsApi
import com.endiel.newsapp.news_feature.domain.repository.NewsRepository
import com.endiel.newsapp.news_feature.common.Resource
import com.endiel.newsapp.news_feature.data.remote.NewsDto
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor( val api: NewsApi): NewsRepository {
    override suspend fun getNews(): List<NewsDto> {
        return api.getNews()
    }
}