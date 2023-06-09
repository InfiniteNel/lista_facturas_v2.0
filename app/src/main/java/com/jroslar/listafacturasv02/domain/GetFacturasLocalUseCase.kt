package com.jroslar.listafacturasv02.domain

import com.jroslar.listafacturasv02.data.FacturasRepository
import com.jroslar.listafacturasv02.data.model.FacturaModel

class GetFacturasLocalUseCase constructor(
    private val repository: FacturasRepository
) {
    suspend operator fun invoke(): List<FacturaModel> {
        val facturas = repository.getAllFacturasLocal()

        return facturas.ifEmpty { emptyList() }
    }
}