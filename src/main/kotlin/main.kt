import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun main() {
  coroutineScope {
    launchHello()
  }
}

context(CoroutineScope)
fun launchHello() {
  launch {
    println("Hello, world!")
  }
}
