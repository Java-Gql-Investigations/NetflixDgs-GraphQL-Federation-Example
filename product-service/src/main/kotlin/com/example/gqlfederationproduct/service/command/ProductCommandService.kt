package com.example.gqlfederationproduct.service.command

import com.example.gqlfederationproduct.domain.Product
import com.example.gqlfederationproduct.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductCommandService(
    private val productRepository: ProductRepository
) {
    fun initProducts() {
        val products = listOf(
            Product(1, "The Hobbit", 100),
            Product(2, "Harry Potter and the Philosopher's Stone", 55),
            Product(3, "The Little Prince", 25),
            Product(4, "Dream of the Red Chamber", 230),
            Product(5, "And Then There Were None", 182),
        )
        productRepository.saveAll(products)
    }
}