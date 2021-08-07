package com.example.gqlfederationreview.repository

import com.example.gqlfederationreview.domain.Review
import org.springframework.data.repository.CrudRepository

interface ReviewRepository : CrudRepository<Review, Int> {
    fun findByProductId(productId: Int): List<Review>
    fun findByUserId(productId: Int): List<Review>
}