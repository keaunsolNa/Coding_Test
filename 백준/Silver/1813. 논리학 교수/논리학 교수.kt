import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val bool = readLine().split(" ").map { it.toInt() }
    var max = -1

    for (i in 0 .. case) {
        val cnt = bool.filter { it == i }.size

        if (i == cnt) max = max(max, cnt)
    }

    println(max)
}