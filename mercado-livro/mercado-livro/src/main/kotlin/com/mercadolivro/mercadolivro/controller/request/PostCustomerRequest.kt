package com.mercadolivro.mercadolivro.controller.request

import com.mercadolivro.mercadolivro.Model.CustomerModel

data class PostCustomerModel (
    var name: String,
    var email: String
) {
    fun toCustomerModel(): CustomerModel {
        return CustomerModel(name = this.name, email = this.email)
    }
}