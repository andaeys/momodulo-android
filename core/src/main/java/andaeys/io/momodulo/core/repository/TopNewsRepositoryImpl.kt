package andaeys.io.momodulo.core.repository

import andaeys.io.momodulo.core.api.ApiService
import andaeys.io.momodulo.core.model.TopNews
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class TopNewsRepositoryImpl @Inject constructor (private val apiService: ApiService) : TopNewsRepository {
    override suspend fun fetchTopNews(): TopNews = withContext(Dispatchers.IO) {
        val response = apiService.getTopHeadlines()
        if (response.status!="ok") {
            throw Exception("Error fetching top news")
        }
        TopNews(
            articles = response.articles
        )
    }
}
