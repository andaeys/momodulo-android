package andaeys.io.momodulo.core.model

data class TopNewsResponse(
    val articles: List<Article>,
    val status: String?,
    val totalResults: Int=0
)