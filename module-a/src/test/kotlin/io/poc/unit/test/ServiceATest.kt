package io.poc.unit.test

import io.poc.unit.test.ServiceA
import org.junit.Assert
import org.junit.jupiter.api.Test

class ServiceATest {

    @Test
    fun processTest() {

        val test1 = ServiceA()

        Assert.assertEquals("CommonService", test1.process())


        Assert.assertEquals("ServiceA", test1.processChild())

    }
}
