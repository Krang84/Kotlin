class Dog(val name: String, var weight: Int, breed_param: String) {
     var activities = arrayOf("walks");
     val breed = breed_param.uppercase(Locale.getDefault());
     fun bark() {
         println(if (weight < 20) "Yip" else "Woof")
     }
 }


fun main() {
    var myDog=Dog("Fido",70,"Mixed")
    println(myDog.breed)
    println(myDog.activities[0])
}
