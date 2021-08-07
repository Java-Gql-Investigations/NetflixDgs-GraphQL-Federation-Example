package com.example.gqlfederationuser.repository

import com.example.gqlfederationuser.domain.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int> {
    fun findByName(name: String): User
}