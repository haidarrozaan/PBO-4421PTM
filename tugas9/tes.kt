import java.util.*

internal object reverse_Number_While {
    @JvmStatic
    fun main(args: Array<String>) {
        var reversenum = 0
        println("Masukan Beberapa Deret Angka: ")
        var angka = readLine()!!.toInt()
        var tes = angka
        while (angka != 0) {
            reversenum = reversenum * 10
            reversenum = reversenum + angka % 10
            angka = angka / 10
        }

        println("Deret Angka Setelah Pembalikan : $reversenum")

        if (tes == reversenum){
            println("jadi $tes sama dengan $reversenum")
        } else {
            println("jadi $tes tidak sama dengan $reversenum")
        }

    }
}