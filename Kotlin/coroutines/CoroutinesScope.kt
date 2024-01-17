package com.aswindev.training.concepts

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    // runBlocking creates a scope and runs coroutine in a blocking way
    println("program execution will now block")
    runBlocking {
        launch {
            delay(1000L)
            println("Task from runBlocking")
        }
        // Scope provides lifecycle methods for coroutines
        // GlobalScope is lifecycle of entire application
        GlobalScope.launch {
            delay(500L)
            println("Task from GlobalScope")
        }
        // coroutineScope creates a new scope and does not complete
        // until all child coroutines complete
        coroutineScope {
            delay(1500L)
            println("Task from coroutineScope")
        }
    }
    println("program execution is unblocked")

    // Context is a set of data that relates to the coroutine. All coroutines have associated context
    // Dispatcher - which thread the coroutine runs in
    // Job - handle on the coroutine lifecycle and there are Job hierarchies
    runBlocking {
        // .launch call returns a Job
        launch(CoroutineName("myCoroutine")) {
            println("This is run from ${coroutineContext.get(CoroutineName.Key)}")
        }
    }
}