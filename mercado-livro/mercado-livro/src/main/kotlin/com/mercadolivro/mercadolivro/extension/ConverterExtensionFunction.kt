package com.mercadolivro.mercadolivro.extension

import com.mercadolivro.mercadolivro.Model.CustomerModel
import com.mercadolivro.mercadolivro.controller.request.PostCustomerModel
import com.mercadolivro.mercadolivro.controller.request.PutCustomerModel

fun PostCustomerModel.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email)
}

fun PutCustomerModel.toCustomerModel(id: String): CustomerModel {
    return CustomerModel(id = id, name = this.name, email = this.email)
}