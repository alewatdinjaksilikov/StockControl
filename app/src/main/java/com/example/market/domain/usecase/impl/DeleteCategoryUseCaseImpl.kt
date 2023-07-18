package com.example.market.domain.usecase.impl

import com.example.market.data.models.ResultData
import com.example.market.domain.repository.MainRepository
import com.example.market.domain.usecase.DeleteCategoryUseCase
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject

class DeleteCategoryUseCaseImpl @Inject constructor(private val mainRepository: MainRepository):DeleteCategoryUseCase {
    override suspend fun execute(id: Int): Flow<ResultData<Any>> {
        return mainRepository.deleteCategory(id = id)
    }
}