package com.andrecastrosousa.blogkotlin.service

import com.andrecastrosousa.blogkotlin.model.Article

interface ArticleService {
    fun listAll() : List<Article>
    fun getById(id: Long): Article
    fun create(blog: Article): Article
    fun update(id: Long, blog: Article): Article
    fun deleteById(id: Long)
}