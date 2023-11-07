package com.andrecastrosousa.blogkotlin.repository

import com.andrecastrosousa.blogkotlin.model.Article
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component

@Component
interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): List<Article>
}