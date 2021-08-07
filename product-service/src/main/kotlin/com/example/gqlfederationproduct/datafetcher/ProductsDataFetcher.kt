package com.example.gqlfederationproduct.datafetcher

import com.example.gqlfederationproduct.domain.Product
import com.example.gqlfederationproduct.service.query.ProductQueryService
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument

@DgsComponent
class ProductsDataFetcher(val productQueryService: ProductQueryService) {
    @DgsQuery
    fun product(@InputArgument id : Int?): Product? = if (id == null) null else productQueryService.findById(id)

    @DgsQuery
    fun products(@InputArgument titleFilter : String?): List<Product> {
        return if(titleFilter != null && titleFilter.isNotBlank()) {
            productQueryService.filterProductsByTitlePart(titleFilter)
        } else {
            productQueryService.findAll()
        }
    }
}