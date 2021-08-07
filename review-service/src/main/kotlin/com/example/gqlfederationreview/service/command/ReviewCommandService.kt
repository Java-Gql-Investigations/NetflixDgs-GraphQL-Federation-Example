package com.example.gqlfederationreview.service.command

import com.example.gqlfederationreview.domain.Review
import com.example.gqlfederationreview.repository.ReviewRepository
import org.springframework.stereotype.Service

@Service
class ReviewCommandService(
    private val reviewRepository: ReviewRepository
) {
    fun initReviews() {
        val reviews = listOf(
            Review(1, 1, 1, 3),
            Review(2, 2, 1, 2),
            Review(3, 1, 2, 5),
            Review(4, 1, 3, 2),
            Review(5, 3, 1, 4),
            Review(6, 4, 1, 1),
            Review(7, 5, 1, 3),
            Review(8, 2, 2, 5),
            Review(9, 2, 3, 1),
            Review(10, 4, 2, 4),
        )
        reviewRepository.saveAll(reviews)
    }
}