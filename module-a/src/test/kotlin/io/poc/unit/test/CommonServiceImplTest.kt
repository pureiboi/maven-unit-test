package io.poc.unit.test

import io.poc.unit.test.CommonServiceImpl
import org.junit.Assert
import org.junit.jupiter.api.Test

class CommonServiceImplTest {

    @Test
    fun processTest() {

        val test1 = CommonServiceImpl()

        Assert.assertEquals("CommonService", test1.process())


        Assert.assertEquals("CommonServiceImpl", test1.processChild())

    }
}
