import andaeys.io.momodulo.core.model.Article


sealed class TopNewsState{

    object Loading: TopNewsState()

    data class Success(
        val articleList: List<Article> = emptyList(),
        val totalArticle: Int = 0
    ): TopNewsState()

    data object Empty: TopNewsState()

    data class Error(
        val errorMessage: String = "Unknown error"
    ): TopNewsState()
}
