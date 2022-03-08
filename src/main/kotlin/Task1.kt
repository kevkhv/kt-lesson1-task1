fun main() {
    val amount = 2900000
    val commission = 0.0075
    val commissionResult = if (amount * commission > 3500) (amount * commission).toInt() else 3500
    println("Сумма перевода $amount копеек")
    println("Комиссия за перевод $commissionResult копеек")
}