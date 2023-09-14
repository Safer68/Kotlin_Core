package operators_if_else

fun main() {
    val a = "Hello"
    val b: String? =
        if (Math.random().toInt() == 1)
            "World"
        else null
    val aL = a.length

//val bL = b.length error
    val c: String
    if (b != null) {
        c = b
        val bL = c.length
    }
    val d: String? = readlnOrNull()

    if (d != null) {
        println(d.length)
        val dL = b
    }
}
