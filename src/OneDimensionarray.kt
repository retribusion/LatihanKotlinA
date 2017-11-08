/**
 * Created by SAINTEK 101 on 10/17/2017.
 */
fun main(args: Array<String>) {
    var arrayInt=Array<Int>(size = 5){0}
    arrayInt[3]=55
    println("Array[3]="+arrayInt[3])

    println("Al Element by object")
    for (element in arrayInt){
        println(element)
    }
    var arrayStr=Array<String>(size = 4){""}
    for (index in 0..3){
        print("arrayStr[ $index]=")
        arrayStr[index]= readLine()!!
    }
    for (index in 0..3){
        println("arrayStr[$index]="+arrayStr[index])
    }
}
