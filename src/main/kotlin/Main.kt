
fun main() {
    names()
    cities()
    numbers()
    println(counties("Nairobi","Nakuru", "Turkana"))

}

fun names(){
    var names= arrayOf("Kyle", "Brandon", "Zuhura", "Janny")
    println(names.contentToString())

}

fun cities() {
    val cities= arrayOf("harare", "mumbai","dodoma","jakarta")
    for (cities in cities)
        println(cities.capitalize())


}
fun numbers(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1].plus(numbers[4]))
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())


}
fun counties(county1:String, county2: String, county3: String):String{
    var place= arrayOf(county1,county2,county3)
    return place.contentToString()

}







