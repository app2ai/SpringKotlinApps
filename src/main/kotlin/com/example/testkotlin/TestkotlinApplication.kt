package com.example.testkotlin

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class TestkotlinApplication : SpringBootServletInitializer(), CommandLineRunner {
    
    fun main(args: Array<String>) {
        runApplication<TestkotlinApplication>(*args)
    }
    
    override fun run(vararg args: String?){
        println("KotlinTest App Started successfully");
        throw UnsupportedOperationException()
    }
}