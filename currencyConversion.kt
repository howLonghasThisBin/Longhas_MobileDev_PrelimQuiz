/**
 * Provided the convertion rate of:
 * 1 PHP > 0.0176265 USD
 * 1 USD > 56.7328 PHP
 * Referencing from: 
 * https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=PHP
 */
fun main() {
    println(pesoToUsd(150.0))
	println(usdToPeso(pesoToUsd(150.0)))
}

fun pesoToUsd(pesoValue: Double): Double{
    val usdValue = 0.0176265
    
    if (pesoValue <= 0.0) {
        throw IllegalArgumentException("No value to convert.")
    }else {
        return (pesoValue*usdValue)
    }
}

fun usdToPeso(usdValue: Double): Double{
    val pesoValue = 56.7328
    
    if (usdValue <= 0.0) {
        throw IllegalArgumentException("No value to convert.")
    }else {
        return (usdValue*pesoValue)
    }
}