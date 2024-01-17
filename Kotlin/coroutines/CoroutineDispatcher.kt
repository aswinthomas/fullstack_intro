package com.aswindev.training.concepts

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.withContext

// Dispatcher determines which thread or thread pool te coroutine runs on
// Dispatcher.Main - updating UI application
// Dispatcher.Default - CPU intensive work
// Dispatcher.IO - useful for network communication, read/write files
// Unconfined - starts coroutine in the inherited dispatcher
// newSingleThreadContext("MyThread") - forces creation of a new thread, not coroutine. Expensive and resource intensive

fun main() {
    runBlocking {
//        launch(Dispatchers.Main) {
//            println("Main Dispatcher. Thread: ${Thread.currentThread().name}")
//        }
        launch(Dispatchers.Unconfined) {
            println("Unconfined Dispatcher1. Thread: ${Thread.currentThread().name}")
            delay(100L)
            println("Unconfined Dispatcher2. Thread: ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Default) {
            println("Default Dispatcher1. Thread: ${Thread.currentThread().name}")
        }
        launch(Dispatchers.IO) {
            println("IO Dispatcher1. Thread: ${Thread.currentThread().name}")
        }
        launch(newSingleThreadContext("MyThread")) {
            println("newSingleThreadContext. Thread: ${Thread.currentThread().name}")
        }
        delay(1000)
        // change context using withContext
        runBlocking {
            launch(Dispatchers.Default) {
                println("\nFirst context: $coroutineContext")
                withContext(Dispatchers.IO) {
                    println("Second context: $coroutineContext")
                }
                println("Third context: $coroutineContext")
            }
        }

    }
}
