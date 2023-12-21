package com.example.lab3.models

class Staff(
    id: Int = 0,
    name: String = "Default",
    var salary: Float = 0.0f,
    var cv: String = "Employee cv"
) : StoreEntity(id, name)