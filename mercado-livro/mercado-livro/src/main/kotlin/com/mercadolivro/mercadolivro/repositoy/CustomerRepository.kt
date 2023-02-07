package com.mercadolivro.mercadolivro.repositoy

import com.mercadolivro.mercadolivro.Model.CustomerModel
import org.springframework.data.repository.CrudRepository

interface CustomerRepository: CrudRepository<CustomerModel, Int> {

    fun findByNameContaining(name: String): List<CustomerModel>
}