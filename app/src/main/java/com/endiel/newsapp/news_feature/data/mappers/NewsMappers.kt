package com.endiel.newsapp.news_feature.data.mappers

import com.endiel.newsapp.news_feature.data.remote.NewsDto
import com.endiel.newsapp.news_feature.domain.model.News

// We need to map the Dto to our domain lever object
fun NewsDto.toNews(): News {
    return News(
        author = author,
        content = content,
        description = description,
        publishedAt = publishedAt,
        source = source,
        title = title,
        url = url,
        urlToImage = urlToImage
    )
}