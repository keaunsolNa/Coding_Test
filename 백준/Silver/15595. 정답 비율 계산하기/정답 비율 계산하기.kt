import java.util.StringTokenizer
 
fun main() = with(System.`in`.bufferedReader()) {
    val submit = HashMap<String, Int>()
    var wrong = 0
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).run {
            nextToken()
            val id = nextToken()
            when (nextToken()) {
                "4" -> if (id != "megalusion") {
                    wrong += submit[id] ?: 0
                    submit[id] = 0
                }
                else -> if (submit[id] != 0) submit[id] = submit[id]?.plus(1) ?: 1
            }
        }
    }
    val correct = submit.filter { it.value == 0 }.size
    println(if (correct + wrong == 0) 0 else (correct.toDouble() / (correct + wrong)) * 100)
}