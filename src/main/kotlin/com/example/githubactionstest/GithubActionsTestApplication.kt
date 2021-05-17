package com.example.githubactionstest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GithubActionsTestApplication

fun main(args: Array<String>) {
	runApplication<GithubActionsTestApplication>(*args)
}
