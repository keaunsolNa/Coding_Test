import java.io.*
import java.util.*

private lateinit var br: BufferedReader

private var N = 0
private var ans = 0
private lateinit var arr: IntArray
private lateinit var map: HashMap<Int, Int>
private lateinit var nums: IntArray

fun main() {
    br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    input()

    bw.write(solve())
    bw.close()
} 

private fun solve(): String {
    val sb = StringBuilder()


    sb.append(twoPointer(0, 0, 0, 0, 0))
    return sb.toString()
} 

private fun twoPointer(low: Int, high: Int, count: Int, kind: Int, max: Int): Int {
    
    if (high >= N) {
        return max
    }

    var newCount = count
    var newKind = kind
    var newLow = low
    var newMax = max

    if (nums[arr[high]] == 0) {
        newKind++
    }

    newCount++
    nums[arr[high]]++

    if (newKind > 2) {
        if (--nums[arr[low]] == 0) {
            newKind--
        }
        newCount--
        newLow++
    }

    newMax = max.coerceAtLeast(newCount)
    return twoPointer(newLow, high + 1, newCount, newKind, newMax)
} 

private fun input() {
    N = br.readLine().toInt()
    ans = -1
    map = HashMap()
    nums = IntArray(10)

    val st = StringTokenizer(br.readLine())
    arr = IntArray(N) {
        st.nextToken().toInt()
    }
} 