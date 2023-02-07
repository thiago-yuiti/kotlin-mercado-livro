package com.mercadolivro.mercadolivro.service

import com.mercadolivro.mercadolivro.Model.CustomerModel
import com.mercadolivro.mercadolivro.controller.request.PostCustomerModel
import com.mercadolivro.mercadolivro.controller.request.PutCustomerModel
import com.mercadolivro.mercadolivro.repositoy.CustomerRepository
import org.springframework.stereotype.Service


@Service
class CustomerService(
    val customerRepository: CustomerRepository
) {

    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customerRepository.findByNameContaining(it)
        }
        return customerRepository.findAll().toList()
    }

    fun create(customer: CustomerModel) {
        customerRepository.save(customer)
    }

    fun getCustomer(id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow()
    }

    fun update(customer: CustomerModel) {
        if(!customerRepository.existsById(customer.id!!)) {
            throw Exception()
        }
        customerRepository.save(customer)
    }

    fun delete(id: Int) {
        if(!customerRepository.existsById(id)) {
            throw Exception()
        }
        customerRepository.deleteById(id)
    }
}