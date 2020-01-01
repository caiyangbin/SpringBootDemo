package com.example.mongodome.entity

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document


@Document(indexName = "movie",type = "douban")
data class EsMongoDoubanEntity(
        /**
         * _id : 10000801
         * cover : https://img3.doubanio.com/f/movie/03d3c900d2a79a15dc1295154d5293a2d5ebd792/pics/movie/tv_default_large.png
         * title : 拉普兰
         * url : https://movie.douban.com/subject/10000801/
         * actor : 斯蒂芬·格拉汉姆 / 扎威·阿什顿 / Elizabeth Berrington
         * author : Michael Wynne
         * cover_local : db_cover\tv_default_large.png
         * create_time : 1553071266388
         * date_published : null
         * director : Catherine Morshead
         * genre : 喜剧
         * imdb_id : tt2091334
         * introduction : null
         * language : 英语
         * length : null
         * m_production_country : 英国
         * other_name : null
         * rating_human : null
         * rating_num :
         * type : 1
         * update_time : null
         * episode : null
         * first_broadcast : null
         * season_count : null
         * single_length : null
         */
        @Id
        var id: String? = null,
        var cover: String? = null,
        var title: String? = null,
        var url: String? = null,
        var actor: String? = null,
        var author: String? = null,
        var cover_local: String? = null,
        var create_time: Long = 0,
        var date_published: Any? = null,
        var director: String? = null,
        var genre: String? = null,
        var imdb_id: String? = null,
        var introduction: Any? = null,
        var language: String? = null,
        var length: Any? = null,
        var m_production_country: String? = null,
        var other_name: Any? = null,
        var rating_human: Any? = null,
        var rating_num: String? = null,
        var type: Int = 0,
        var update_time: Any? = null,
        var episode: Any? = null,
        var first_broadcast: Any? = null,
        var season_count: Any? = null,
        var single_length: Any? = null,
        var languageType: Int = 0,
        var test: String? = ""
)