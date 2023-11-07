package com.andrecastrosousa.blogkotlin

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class BlogKotlinApplication

fun main(args: Array<String>) {
	runApplication<BlogKotlinApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
