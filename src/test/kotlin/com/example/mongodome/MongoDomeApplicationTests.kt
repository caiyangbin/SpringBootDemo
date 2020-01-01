package com.example.mongodome

import com.example.mongodome.entity.MongoDoubanEntity
import com.example.mongodome.repostory.EsMovieDoubanRepostory
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.Update
import org.springframework.web.client.RestTemplate

@SpringBootTest
class MongoDomeApplicationTests {

    @Test
    fun contextLoads() {
    }


    @Autowired
    private lateinit var mongoTemplate: MongoTemplate
    @Autowired
    private lateinit var esMovieDoubanRepostory: EsMovieDoubanRepostory

    @Test
    fun testClient() {
        val restTemplate = RestTemplate()
        val url = "https://api.themoviedb.org/3/discover/movie" +
                "?api_key=8ed327a26e13ce909acba31e719e7659" +
                "&language=zh-CN" +
                "&page={page}"
        val str = restTemplate.getForObject(url, String::class.java, 2)
        println(str)
    }

    @Test
    fun getDoubanList() {
        val query = Query(Criteria.where("title").`is`("变形金刚"))
        val findOne = mongoTemplate.findOne(query, MongoDoubanEntity::class.java)
        System.err.println(findOne)
    }

    @Test
    fun update() {
        val query = Query(Criteria.where("title").`is`("变形金刚"))
        val update = Update()
        update.set("test","333")
        mongoTemplate.updateFirst(query,update, MongoDoubanEntity::class.java)
    }

    @Test
    fun esTest(){
        val findAll = esMovieDoubanRepostory.findAll()
        findAll.forEach {
            System.err.println(it.title)
        }
    }


}
