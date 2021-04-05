package dev.marcinkiewicz.httpclients

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinHttpClientsApplication

fun main(args: Array<String>) {
	runApplication<KotlinHttpClientsApplication>(*args)
}
