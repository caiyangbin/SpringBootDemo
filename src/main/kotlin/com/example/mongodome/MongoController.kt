package com.example.mongodome

import com.example.mongodome.task.TmdbRequestTask
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate


@RestController
class MongoController {

    @Autowired
    private lateinit var tmdbRequestTask: TmdbRequestTask

    @RequestMapping("/hello")
    fun hello(): String {
        return "hello spring"
    }

    @RequestMapping("/tmdb/movie/list/{page}")
    fun tmdbList(@PathVariable page: String): String {
        val restTemplate = RestTemplate()
        val url = "https://api.themoviedb.org/3/discover/movie" +
                "?api_key=8ed327a26e13ce909acba31e719e7659" +
                "&language=zh-CN" +
                "&page={page}"
        val str = restTemplate.getForObject(url, String::class.java, page)
        println(str)
        return str.toString()
    }

    @RequestMapping("/test")
    fun test(): String {
        tmdbRequestTask.test()
        return "succses"
    }
}