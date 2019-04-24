package com.mindhaq.logbookloggingdemo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.zalando.logbook.BodyFilter
import org.zalando.logbook.BodyFilter.merge
import org.zalando.logbook.BodyFilters.defaultValue
import org.zalando.logbook.json.JsonBodyFilters.replaceJsonStringProperty

@Configuration
class LogBookConfiguration {

    @Bean
    fun bodyFilter(): BodyFilter {
        return merge(
                defaultValue(),
                replaceJsonStringProperty(
                        setOf("email"),
                        "***"
                )
        )
    }
}