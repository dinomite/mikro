package net.dinomite.web

import org.jetbrains.ktor.application.Application
import org.jetbrains.ktor.application.call
import org.jetbrains.ktor.application.install
import org.jetbrains.ktor.features.DefaultHeaders
import org.jetbrains.ktor.logging.CallLogging
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.get
import org.jetbrains.ktor.routing.routing

fun Application.main() {
    install(DefaultHeaders)
    install(CallLogging)

    routing {
        get("/{...}") {
            call.respondText("Catchall endpoint")
        }

        get("/somewhere-else") {
            call.respondText("This hit /somewhere-else")
        }
    }
}