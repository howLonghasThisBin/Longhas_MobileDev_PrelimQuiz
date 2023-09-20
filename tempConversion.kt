fun main() {
    // Convert from Celcius
    println(CtoF(32.0))
    println(CtoK(32.0))
    // Convert from Fahrenheit
    println(FtoC(89.6))
    println(FtoK(89.6))
    // Convert from Kelvin
    println(KtoC(305.15))
    println(KtoF(305.15))
}
// Celcius to Fahrenheit
fun CtoF(cValue: Double): String{
    val fValue = (cValue * 9/5) + 32
    val converted = "${cValue} °C = ${fValue} °F"
    return converted
}
// Celcius to Kelvin
fun CtoK(cValue: Double): String{
    val kValue = cValue + 273.15
    val converted = "${cValue} °C = ${kValue} K"
    return converted
}
// Fahrenheit to Celcius
fun FtoC(fValue: Double): String{
    val cValue = (fValue - 32) * 5/9
    val converted = "${fValue} °F = ${cValue} °C"
    return converted
}
// Fahrenheit to Kelvin
fun FtoK(fValue: Double): String{
    val kValue = (fValue - 32) * 5/9 + 273.15 
    val converted = "${fValue} °F = ${kValue} K"
    return converted
}
// Kelvin to Celcius
fun KtoC(kValue: Double): String{
    val cValue = kValue - 273.15 
    val converted = "${kValue} K = ${cValue} °C"
    return converted
}
// Kelvin to Fahrenheit
fun KtoF(kValue: Double): String{
    val fValue = (kValue - 273.15) * 9/5 + 32
    val converted = "${kValue} K = ${fValue} °F"
    return converted
}