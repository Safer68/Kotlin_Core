package construction_wen

fun main() {

    val isEnabled = true
    when(isEnabled){
        false -> println("isEnabled off")
        true -> println("isEnabled on")
    }

    val a = 30
    when(a){
        10 -> println("a = 10")
        20 -> println("a = 20")
        else -> println("неопределенное значение")
    }
    val b = 30
    when(b){
        10 -> println("b = 10")
        20 -> println("b = 20")
        else -> println("неопределенное значение")
    }
    val c = 10
    when(c){
        in 10..19 -> println("c в диапазоне от 10 до 19")
        in 20..29 -> println("c в диапазоне от 20 до 29")
        !in 10..20 -> println("c вне диапазона от 10 до 20")
        else -> println("неопределенное значение")
    }
    val d = 10
    val e = 5
    val f = 3
    when(d){
        e - f -> println("d = e - f")
        e + 5 -> println("d = e + 5")
        else -> println("неопределенное значение")
    }
    when(a + b){
        10 -> println("a + b = 10")
        20 -> println("a + b = 20")
        30 -> println("a + b = 30")
        else -> println("Undefined")
    }
    when(val c = a + b){
        10 -> println("a + b = 10")
        20 -> println("a + b = 20")
        else -> println("c = $c")
    }
    when{
        (b > 10) -> println("b больше 10")
        (a > 10) -> println("a больше 10")
        else -> println("и a, и b меньше или равны 10")
    }
    val sum = 1000

    val rate = when(sum){
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }
    println(rate)
}