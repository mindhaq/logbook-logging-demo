package com.mindhaq.logbookloggingdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @GetMapping("/error")
    fun error(): Foo {
        // no response will be logged by logbook
        throw RuntimeException()
    }

    @GetMapping("/success")
    fun success(): Foo {
        // request and response are logged by logbook
        return Foo()
    }
}

data class Foo(
        val bar: String = "foo-bar",
        val email: String = "someone@example.com",
        val other: Foo? = Foo("other-bar", "bar@example.com", null)
)
