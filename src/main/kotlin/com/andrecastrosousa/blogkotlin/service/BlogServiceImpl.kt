package com.andrecastrosousa.blogkotlin.service

import com.andrecastrosousa.blogkotlin.model.Blog
import com.andrecastrosousa.blogkotlin.repository.BlogRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException
import java.util.*

class BlogServiceImpl @Autowired constructor(private val blogRepository: BlogRepository) : BlogService {


    override fun listAll(): List<Blog> {
        return blogRepository.findAll();
    }

    override fun getById(id: Long): Blog {
        val blog: Optional<Blog> = blogRepository.findById(id);
        if(blog.isEmpty) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Blog not found")
        }

        return blog.get()
    }

    override fun create(blog: Blog): Blog {
        TODO("Not yet implemented")
    }

    override fun update(id: Long, blog: Blog): Blog {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long) {
        TODO("Not yet implemented")
    }
}