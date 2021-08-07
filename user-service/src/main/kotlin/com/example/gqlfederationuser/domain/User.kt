package com.example.gqlfederationuser.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User(@Id @GeneratedValue var id: Int? = null, var name: String)