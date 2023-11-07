package com.andrecastrosousa.blogkotlin.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import toSlug

@Entity
class Article(var title: String, var headline: String, @ManyToOne var author: User, slug: String = title.toSlug(), @Id @GeneratedValue var id: Long?, var name: String) {
}