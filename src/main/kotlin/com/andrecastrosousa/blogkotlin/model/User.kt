package com.andrecastrosousa.blogkotlin.model

import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

class User(
    var login: String,
    var firstname: String,
    var lastname: String,
    var description: String? = null,
    @Id @GeneratedValue var id: Long? = null) {
}