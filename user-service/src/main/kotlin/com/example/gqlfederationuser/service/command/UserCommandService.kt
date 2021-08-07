package com.example.gqlfederationuser.service.command

import com.example.gqlfederationuser.domain.User
import com.example.gqlfederationuser.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserCommandService(
    private val userRepository: UserRepository
) {
    fun initUsers() {
        val users = listOf(
            User(1, "Frodo"),
            User(2, "Sam"),
            User(3, "Bilbo"),
            User(4, "Pippin"),
        )
        userRepository.saveAll(users)
    }
}