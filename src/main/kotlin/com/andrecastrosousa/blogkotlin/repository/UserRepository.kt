package com.andrecastrosousa.blogkotlin.repository

import com.andrecastrosousa.blogkotlin.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component

@Component
interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}