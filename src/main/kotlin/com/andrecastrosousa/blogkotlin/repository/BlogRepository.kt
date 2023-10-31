package com.andrecastrosousa.blogkotlin.repository

import com.andrecastrosousa.blogkotlin.model.Blog
import org.springframework.data.jpa.repository.JpaRepository

interface BlogRepository: JpaRepository<Blog, Long> {
}