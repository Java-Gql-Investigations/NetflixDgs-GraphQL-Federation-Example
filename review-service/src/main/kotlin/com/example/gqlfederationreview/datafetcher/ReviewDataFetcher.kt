package com.example.gqlfederationreview.datafetcher

import com.example.gqlfederationreview.domain.Review
import com.example.gqlfederationreview.service.query.ReviewQueryService
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument

@DgsComponent
class ReviewDataFetcher(val reviewQueryService: ReviewQueryService) {
    @DgsQuery
    fun usersReviews(@InputArgument userId : Int): List<Review> = reviewQueryService.findByUserId(userId)

    @DgsQuery
    fun productsReviews(@InputArgument productId : Int): List<Review> = reviewQueryService.findByProductId(productId)
}