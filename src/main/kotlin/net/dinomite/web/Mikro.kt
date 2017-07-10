package net.dinomite.web

import org.jetbrains.ktor.application.Application
import org.jetbrains.ktor.application.call
import org.jetbrains.ktor.application.install
import org.jetbrains.ktor.features.DefaultHeaders
import org.jetbrains.ktor.logging.CallLogging
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.Routing
import org.jetbrains.ktor.routing.get

fun Application.main() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Routing) {
        service()
    }
}

/**
 * Override this to define your own endpoints
 */
private fun Routing.service() {
    get("/{...}") {
        call.respondText("You should override Routing.service()")
    }

    get("/somewhere-else") {
        call.respondText("This hit /somewhere-else")
    }
}
