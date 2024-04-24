package andaeys.io.momodulo.core.api

import andaeys.io.momodulo.core.model.TopNewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String = ApiConstant.COUNTRY,
        @Query("apiKey") apiKey: String = ApiConstant.API_KEY,
        @Query("category") category: String= ApiConstant.CATEGORY,
    ): TopNewsResponse
}
