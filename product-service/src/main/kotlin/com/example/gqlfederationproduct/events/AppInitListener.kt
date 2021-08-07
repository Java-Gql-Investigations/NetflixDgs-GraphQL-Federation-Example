package com.example.gqlfederationproduct.events

import com.example.gqlfederationproduct.service.command.ProductCommandService
import org.slf4j.LoggerFactory
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Order(0)
class AppInitListener(
    private val productCommandService: ProductCommandService
) : ApplicationListener<ApplicationReadyEvent> {
    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        val log = LoggerFactory.getLogger(javaClass)
        log.info("Initializing default products")
        productCommandService.initProducts()
    }
}