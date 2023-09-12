package com.test

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

fun main() {
    val mapper = ObjectMapper().registerKotlinModule()

    println(mapper.writeValueAsString(SomeJsonTest(false, "testing")))
}

data class SomeJsonTest(@JsonProperty("isEMarketingAccepted") val isEMarketing: Boolean, val name: String)