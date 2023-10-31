package com.andrecastrosousa.blogkotlin.service

import com.andrecastrosousa.blogkotlin.model.Blog
import com.andrecastrosousa.blogkotlin.repository.BlogRepository
import org.apache.tomcat.util.http.parser.HttpParser
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
        blogRepository.save(blog)

        return blog
    }

    override fun update(id: Long, blog: Blog): Blog {
        val optionalBlog: Optional<Blog> = blogRepository.findById(id);
        if(optionalBlog.isPresent) {
            val foundBlog: Blog = optionalBlog.get();
            foundBlog.name = blog.name
            blogRepository.save(foundBlog);
            return blog
        }

        throw ResponseStatusException(HttpStatus.NOT_FOUND, "Blog not found")
    }

    override fun deleteById(id: Long) {
        val optionalBlog: Optional<Blog> = blogRepository.findById(id)
        if(optionalBlog.isPresent) {
            blogRepository.deleteById(id)
            return
        }

        throw ResponseStatusException(HttpStatus.NOT_FOUND, "Blog not found")
    }
}