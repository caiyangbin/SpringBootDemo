package com.example.mongodome.repostory

import com.example.mongodome.entity.EsMongoDoubanEntity
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface EsMovieDoubanRepostory:ElasticsearchRepository<EsMongoDoubanEntity,String> {
}