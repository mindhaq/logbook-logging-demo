package com.mindhaq.logbookloggingdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @GetMapping("/error")
    fun error() {
        throw RuntimeException()
    }
}