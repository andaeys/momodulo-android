package andaeys.io.momodulo.core.repository

import andaeys.io.momodulo.core.model.TopNews

interface TopNewsRepository {
    suspend fun fetchTopNews(): TopNews
}
