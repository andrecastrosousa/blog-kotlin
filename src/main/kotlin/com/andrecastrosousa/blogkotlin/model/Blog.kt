package com.andrecastrosousa.blogkotlin.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Blog(@Id @GeneratedValue var id: Long?, var name: String) {
}