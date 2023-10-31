package com.andrecastrosousa.blogkotlin

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogKotlinApplication

fun main(args: Array<String>) {
	runApplication<BlogKotlinApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
