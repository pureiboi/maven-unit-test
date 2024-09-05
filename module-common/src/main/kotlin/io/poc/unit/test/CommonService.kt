package io.poc.unit.test


abstract class CommonService {

    fun process(): String {
        println("CommonService process")

        processChild()

        return CommonService::class.java.simpleName
    }

    abstract fun processChild(): String
}
