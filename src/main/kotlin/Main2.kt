import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.*

fun main() {
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.FLOOR
    println("${moneyToString("R$ 2000.00")}")
//    println("value:${df.format("200.00").format(Locale.ENGLISH).toDouble()}")
}

fun moneyToString(value: String): String? {
    var values = ""
    values = value.substring(2)
    values = values.replace(".", "")
    values = values.replace(",", ".")

    return values
}