package com.example.protocrestsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication(scanBasePackages = ["com.example.protocrestsample"])
class ProtocRestSampleApplication

fun main(args: Array<String>) {
    runApplication<ProtocRestSampleApplication>(*args)
}
