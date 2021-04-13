import kotlinx.coroutines.*

import org.junit.Assert
import org.junit.Test
import java.util.*

class MyTest {
    @Test
    fun testMySuspendingFunction() = runBlocking<Unit> {

        println("Wait Until Coroutine Completes")
        val job = GlobalScope.launch {
            println("Inner Job!!!")
            this.cancel("Suspend")
            delay(3000L)
            // launch a new coroutine in background and continue
            println("World!")
        }
        println("Hello,") // main coroutine continues here immediately

        // Wait Until Coroutine Completes
        job.join()
    }

    @Test
    fun testWaitingForAJob() = runBlocking {

    }

    @Test
    fun testScopeBuilder() = runBlocking {
        launch {
            delay(200L)
            println("Task from runBlocking")
        }

        coroutineScope {
            launch {
                delay(500L)
                println("Task from nested launch")
            }

            delay(100L)
            println("Task from coroutine scope")
        }

        println("Coroutine scope is over")
    }

    suspend fun doWorld() {
        delay(3000L)
        print("World!\n${Date().time}\n")
    }

    @Test
    fun testSuspendedFunction() = runBlocking {
        launch { doWorld() }
        print("${Date().time}\nHello, ")
    }

    @Test
    fun testAreLightWeight() = runBlocking {
        repeat(100_000) {
            launch {
                delay(5000L)
                print(".")
            }
        }
    }

    @Test
    fun testGlobalCoroutinesDaemonThreads() = runBlocking {
        GlobalScope.launch {
            repeat(1000) {
                println("I'm sleeping $it ...")
                delay(500L)
            }
        }
        delay(1300L)
    }

}