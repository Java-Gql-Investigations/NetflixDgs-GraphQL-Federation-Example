package com.example.gqlfederationreview.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Review(@Id @GeneratedValue var id: Int? = null, var userId: Int, var productId: Int, var rating: Int)