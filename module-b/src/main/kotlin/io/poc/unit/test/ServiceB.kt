package io.poc.unit.test

class ServiceB: CommonService() {

    override fun processChild(): String {
        return this::class.java.simpleName
    }

    fun processv2(text: String) {

        if (text == "service") {
            println("is service")
        } else {
            println("is unknown")
        }

    }

}
