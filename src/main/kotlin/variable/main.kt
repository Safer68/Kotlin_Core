package variable

/**
 * val - значение в программе можно присвоить только один раз.
 *
 * const val -Объявление и определение констант происходит за пределами функции.
 * Потому что код внутри функций выполняется при исполнении программы,
 * а сигнатуры функций и полей должны быть известны на момент компиляции.
 *
 * var - изменяемая переменная.
 */
const val N: Int = 10
var n = true
fun variable() {

    /**
     * val a: Int = 5
     */
    val a = 5
    println(a)
    /**
     * var b: Int = 10
     */
    var b = 10
    b /= 3
    println(b)

    val s = "hello"
    val s2: String
    val c = 'W'
    val c2: Char = s[0]
    s2 = s + c
    println(s2)
    println(c2)
    println(N)
    val nul = null
    val nul1: String? = null
    println(nul)
    println(nul1)
    val h: String = readln()
    val v: String? = readlnOrNull()
    exPrint(h)
    println(v)
}
fun exPrint(s:String){
    println("печать $s !")
}