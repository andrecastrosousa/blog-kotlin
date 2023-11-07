package com.andrecastrosousa.blogkotlin.service

import com.andrecastrosousa.blogkotlin.model.Article
import com.andrecastrosousa.blogkotlin.repository.ArticleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException
import java.util.*

class ArticleServiceImpl @Autowired constructor(private val articleRepository: ArticleRepository) : ArticleService {


    override fun listAll(): List<Article> {
        return articleRepository.findAll() as List<Article>
    }

    override fun getById(id: Long): Article {
        val blog: Optional<Article> = articleRepository.findById(id);
        if(blog.isEmpty) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Article not found")
        }

        return blog.get()
    }

    override fun create(blog: Article): Article {
        articleRepository.save(blog)

        return blog
    }

    override fun update(id: Long, blog: Article): Article {
        val optionalArticle: Optional<Article> = articleRepository.findById(id);
        if(optionalArticle.isPresent) {
            val foundArticle: Article = optionalArticle.get();
            foundArticle.name = blog.name
            articleRepository.save(foundArticle);
            return blog
        }

        throw ResponseStatusException(HttpStatus.NOT_FOUND, "Article not found")
    }

    override fun deleteById(id: Long) {
        val optionalArticle: Optional<Article> = articleRepository.findById(id)
        if(optionalArticle.isPresent) {
            articleRepository.deleteById(id)
            return
        }

        throw ResponseStatusException(HttpStatus.NOT_FOUND, "Article not found")
    }
}