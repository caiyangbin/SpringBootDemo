package com.example.mongodome.entity

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "imdb")
data class MongoImdbEntity(
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
        val id: String? = null,
        val cover: String? = null,
        val title: String? = null,
        val url: String? = null,
        val actor: String? = null,
        val author: String? = null,
        val cover_local: String? = null,
        val create_time: Long = 0,
        val date_published: Any? = null,
        val director: String? = null,
        val genre: String? = null,
        val imdb_id: String? = null,
        val introduction: Any? = null,
        val language: String? = null,
        val length: Any? = null,
        val m_production_country: String? = null,
        val other_name: Any? = null,
        val rating_human: Any? = null,
        val rating_num: String? = null,
        val type: Int = 0,
        val update_time: Any? = null,
        val episode: Any? = null,
        val first_broadcast: Any? = null,
        val season_count: Any? = null,
        val single_length: Any? = null,
        val languageType: Int = 0
)