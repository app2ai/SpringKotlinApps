package com.example.testkotlin

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

class ServletInitializer : SpringBootServletInitializer(){
    override fun configure(builderApplication: SpringApplicationBuilder):SpringApplicationBuilder{
        return builderApplication.sources(TestkotlinApplication::class.java)
    }
}