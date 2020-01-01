package com.example.mongodome.base


interface BaseDao<T> {
    fun save(t: T)
    fun save(map: Map<String?, Any?>?)
    fun saveBatch(list: List<T>?)
    fun update(t: T): Int
    fun update(map: Map<String?, Any?>?): Int
    fun delete(id: Any?): Int
    fun delete(map: Map<String?, Any?>?): Int
    fun deleteBatch(id: Array<Any?>?): Int
    fun queryObject(id: Any?): T
    fun queryList(map: Map<String?, Any?>?): List<T>?
    fun queryList(id: Any?): List<T>?
    fun queryTotal(map: Map<String?, Any?>?): Int
    fun queryTotal(): Int
}