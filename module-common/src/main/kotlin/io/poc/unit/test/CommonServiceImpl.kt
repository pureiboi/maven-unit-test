package io.poc.unit.test


class CommonServiceImpl: CommonService() {

    override fun processChild(): String {
        return CommonServiceImpl::class.java.simpleName
    }

}
