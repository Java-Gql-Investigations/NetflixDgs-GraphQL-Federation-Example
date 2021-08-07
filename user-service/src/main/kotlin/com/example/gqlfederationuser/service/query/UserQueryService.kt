package com.example.gqlfederationuser.service.query

import com.example.gqlfederationuser.domain.User
import com.example.gqlfederationuser.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserQueryService(
    private val userRepository: UserRepository
) {
    fun findByName(name: String): User {
        return userRepository.findByName(name)
    }
}