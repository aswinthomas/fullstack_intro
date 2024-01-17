package com.aswindev.training.concepts

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        // handler required if using launch
        val myHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
            println("Exception Handled: ${throwable.localizedMessage}")
        }
        val job: Job = GlobalScope.launch(myHandler) {
            println("Throwing exception from job")
            throw IndexOutOfBoundsException("Exception in Coroutine")
        }
        // must join for the exception to be handled
        job.join()

        val deferred = GlobalScope.async {
            println("Throwing exception from async")
            throw ArithmeticException("Exception from Async")
        }
        // use try catch if using async
        try {
            deferred.await()
        }catch (e: ArithmeticException){
            println("Caught Exception: ${e.localizedMessage}")
        }
    }
}