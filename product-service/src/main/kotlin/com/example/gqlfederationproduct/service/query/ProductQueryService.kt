package com.example.gqlfederationproduct.service.query

import com.example.gqlfederationproduct.domain.Product
import com.example.gqlfederationproduct.repository.ProductRepository
import graphql.com.google.common.collect.Lists
import org.springframework.stereotype.Service

@Service
class ProductQueryService(
    private val productRepository: ProductRepository
) {
    fun filterProductsByTitlePart(titlePart: String) : List<Product> {
        return productRepository.findByTitleContaining(titlePart)
    }

    fun findAll(): List<Product> {
        return Lists.newArrayList(productRepository.findAll())
    }

    fun findById(id: Int): Product {
        return productRepository.findById(id).orElse(null)
    }
}