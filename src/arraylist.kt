fun main(args: Array<String>) {
    var arraylist= ArrayList<String>()
    arraylist.add("Rafi")
    arraylist.add("Irawan")
    arraylist.add("Jepara")

    println("Nama Depan:"+arraylist.get(0))
    arraylist.set(0,"Unisnu")

    println("All element by index")
    for (index in 0..arraylist.size-1){
        println(arraylist.get(index))
    }
    if (arraylist.contains("Unisnu")){
        println("name is found")
    }else{
        println("name is not found")
    }
}