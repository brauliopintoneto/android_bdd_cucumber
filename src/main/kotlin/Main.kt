import kotlinx.coroutines.*

class Main {

}


fun main() {
    GlobalScope.launch { // launch a new coroutine in background and continue
        println("value:${"200.00".toDouble()}")
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello,") // main thread continues while coroutine is delayed
    runBlocking {
        delay(2000L) // block main thread for 2 seconds to keep JVM alive
    }


}

//fun main() = runBlocking<Unit> { // start main coroutine
//    GlobalScope.launch {
//        repeat(1000) {
//            print("-> ")
//            delay(500L)
//            println("I'm sleeping $it ...")
//        }
//    }
//    GlobalScope.launch {
//        repeat(100000) {
//            delay(100L)
//            println("*")
//        }
//    }
//
//    delay(2500L)
//
//    println("Finish")
//}
