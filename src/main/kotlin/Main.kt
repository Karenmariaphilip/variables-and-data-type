fun main() {
    nameFor("lucy", "stacy","ann")
    adultForHowLong(30)
    infoFunction(17, 78)
    namesFrom("daisy", "gloris", "tracy")
    names("jacy", "mary","janet","hassan")
}


fun names(name1: String, name2: String, name3: String, name4: String) {
    var nameArray = arrayOf(name1, name2, name3, name4)
    println(nameArray.contentToString())
}

fun nameFor(a1: String, b2: String, c3: String): String {
    var aArray = arrayOf(a1, b2, c3)
    return aArray.contentToString()
}
fun adultForHowLong(num:Int){
    var num= num-23
    var sentence= ("I have been adult for $num years")
    println(sentence)
}
fun infoFunction(num1:Int, num2:Int){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers.indexOf(158))
    println(numbers[1] + numbers[4])
    var newNumber= numbers.sortedArray()
    println(newNumber.contentToString())
}
fun namesFrom(name1:String, name2:String, name3:String):String{
    var nameArray= arrayOf(name1,name2,name3)
    return nameArray.contentToString()
}