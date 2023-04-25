package com.leandrolcd.pruebatecnica.domain.usecase

import com.leandrolcd.pruebatecnica.domain.PosRepository
import com.leandrolcd.pruebatecnica.ui.menu.models.Category
import javax.inject.Inject

class MenuUseCase @Inject constructor(private val repository: PosRepository) {
    suspend operator fun invoke():List<Category> = repository.doMenuAndConfiguration()
}