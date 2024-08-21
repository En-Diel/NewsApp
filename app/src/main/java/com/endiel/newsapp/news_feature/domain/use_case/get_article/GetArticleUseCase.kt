package com.endiel.newsapp.news_feature.domain.use_case.get_article

import com.endiel.newsapp.news_feature.common.Resource
import com.endiel.newsapp.news_feature.data.mappers.toNews
import com.endiel.newsapp.news_feature.domain.model.News
import com.endiel.newsapp.news_feature.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetArticleUseCase @Inject constructor(
    private val repository: NewsRepository
) {
    operator fun invoke(): Flow<Resource<List<News>>> = flow {
        try {
            emit(Resource.Loading())
            val news = repository.getNews().map { it.toNews() }
            emit(Resource.Success(news))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred" ))
        }catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server, check your internet connection"))
        }
    }
}