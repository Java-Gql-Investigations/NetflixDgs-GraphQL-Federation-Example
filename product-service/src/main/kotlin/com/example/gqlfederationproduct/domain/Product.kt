package com.example.gqlfederationproduct.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Product(@Id @GeneratedValue var id: Int? = null, var title: String, var price: Int)