package com.mercadolivro.mercadolivro.service

import com.mercadolivro.mercadolivro.Model.CustomerModel
import com.mercadolivro.mercadolivro.controller.request.PostCustomerModel
import com.mercadolivro.mercadolivro.controller.request.PutCustomerModel
import org.springframework.stereotype.Service


@Service
class CustomerService {
    val customers = mutableListOf<CustomerModel>()

    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customers.filter { it.name.contains(name,true) }
        }
        return customers
    }

    fun create(customer: CustomerModel) {
        val id = if(customers.isEmpty()) {
            1
        } else {
            customers.last().id!!.toInt() + 1
        }
        customers.add(CustomerModel(id,customer.name,customer.email))
        println(customer)
    }

    fun getCustomer(id: Int): CustomerModel {
        return customers.first { it.id == id }
    }

    fun update(customer: CustomerModel) {
        customers.first { it.id == customer.id }.let {
            it.name = customer.name
            it.email = customer.email
        }
    }

    fun delete(id: Int) {
        customers.removeIf { it.id == id }
    }
}