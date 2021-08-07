package com.example.gqlfederationuser.events

import com.example.gqlfederationuser.service.command.UserCommandService
import org.slf4j.LoggerFactory
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Order(0)
class AppInitListener(
    private val userCommandService: UserCommandService
) : ApplicationListener<ApplicationReadyEvent> {
    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        val log = LoggerFactory.getLogger(javaClass)
        log.info("Initializing default users")
        userCommandService.initUsers()
    }
}