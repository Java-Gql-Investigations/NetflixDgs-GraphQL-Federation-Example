package com.example.gqlfederationuser.datafetcher

import com.example.gqlfederationuser.domain.User
import com.example.gqlfederationuser.service.query.UserQueryService
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument

@DgsComponent
class UsersDataFetcher(val userQueryService: UserQueryService) {
    @DgsQuery
    fun user(@InputArgument name : String?): User? = if (name == null) null else userQueryService.findByName(name)
}