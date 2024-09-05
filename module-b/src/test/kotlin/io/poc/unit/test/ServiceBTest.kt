package io.poc.unit.test

import org.junit.Assert
import org.junit.jupiter.api.Test

class ServiceBTest {

    @Test
    fun processTest() {

        val test1 = ServiceB()

        Assert.assertEquals("CommonService", test1.process())


        Assert.assertEquals("ServiceB", test1.processChild())

    }
}
