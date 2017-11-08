fun main(args:Array<String>){
    print("Enter your DOB:")
    var DOB:Int= readLine()!!.toInt()

    var year=2017
    var Age:Int?
    Age=year-DOB

    println("your age is$Age yerars")

}