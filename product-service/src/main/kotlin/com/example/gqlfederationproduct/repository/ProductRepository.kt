package com.example.gqlfederationproduct.repository

import com.example.gqlfederationproduct.domain.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Int> {
    fun findByTitleContaining(namePart: String): List<Product>
}