import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun main() {
  coroutineScope {
    launchHello()
  }
}

// The line below designates a CoroutineScope context receiver for the launchHello function.
// This allows the launch function to be called, since it is an extension function of CoroutineScope.
// At present Sonarqube does not support this feature, thus the `./gradlew sonar` task fails.
// To make sonarqube analysis pass, you can convert this function into an extension function by replacing the following two lines with:
//   fun CoroutineScope.launchHello() {
context(CoroutineScope)
fun launchHello() {
  launch {
    println("Hello, world!")
  }
}
