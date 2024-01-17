package com.aswindev.training.concepts

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

var functionCalls = 0

// Suspend is functions that can be run in a coroutine
suspend fun completeMessage() {
    functionCalls++
    delay(500L)
    println("World!")
}

suspend fun improveMessage() {
    functionCalls++
    delay(1000L)
    println("Suspend functions are cool")
}

fun main() {
    GlobalScope.launch { completeMessage() }
    GlobalScope.launch { improveMessage() }
    print("Hello, ")
    Thread.sleep(2000L)
    println("There were $functionCalls function calls")
}