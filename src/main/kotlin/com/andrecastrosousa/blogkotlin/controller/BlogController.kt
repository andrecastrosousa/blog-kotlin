package com.andrecastrosousa.blogkotlin.controller

import com.andrecastrosousa.blogkotlin.model.Blog
import com.andrecastrosousa.blogkotlin.service.BlogService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/blog")
class BlogController @Autowired constructor(private val blogService: BlogService) {

    @GetMapping
    fun list(): ResponseEntity<List<Blog>> {
        return ResponseEntity.ok(blogService.listAll())
    }
}