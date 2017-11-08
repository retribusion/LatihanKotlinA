/**
 * Created by SAINTEK 101 on 9/30/2017.
 */
fun main(args: Array<String>) {
    print("Masyukkan nama : ")
    var name = readLine()
    print("Masyukkan Umur : ")
    var age:Int = readLine()!!.toInt()
    print("Masyukkan Jurusyan : ")
    var departement:String?
    departement = readLine()
    println("Nama Anda : "+ name)
    println("Umur Anda : "+ age)
    println("Jurusyan : "+ departement)
    val pi:Double=3.4
    println("pi : "+pi)
}
