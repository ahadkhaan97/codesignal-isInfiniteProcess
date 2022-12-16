fun main() {
    print(solution(2, 6))
}

fun solution(a: Int, b: Int): Boolean {
    var tempA = a
    var tempB = b

    while (tempA != tempB) {
        tempA++
        tempB--
        if (tempA > tempB) {
            return true
        }
    }

    return false
}
