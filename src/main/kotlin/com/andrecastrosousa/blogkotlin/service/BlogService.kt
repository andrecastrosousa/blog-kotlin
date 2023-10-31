package com.andrecastrosousa.blogkotlin.service

import com.andrecastrosousa.blogkotlin.model.Blog

interface BlogService {
    fun listAll() : List<Blog>
    fun getById(id: Long): Blog
    fun create(blog: Blog): Blog
    fun update(id: Long, blog: Blog): Blog
    fun deleteById(id: Long)
}