package com.example.lab3.models

class Product(
    id: Int = 0,
    name: String = "Name",
    var price: Float = 100.0f,
    var quantity: Int = 0,
    var description: String = "Description"
) : StoreEntity(id, name)