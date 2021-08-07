package com.example.gqlfederationreview.service.query

import com.example.gqlfederationreview.domain.Review
import com.example.gqlfederationreview.repository.ReviewRepository
import org.springframework.stereotype.Service

@Service
class ReviewQueryService(
    private val reviewRepository: ReviewRepository
) {
    fun findByUserId(userId: Int): List<Review> {
        return reviewRepository.findByUserId(userId)
    }
    fun findByProductId(productId: Int): List<Review> {
        return reviewRepository.findByProductId(productId)
    }
}