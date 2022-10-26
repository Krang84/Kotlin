class DrumKit(var hasTopHat: Boolean, var hasSnare: Boolean) {

    fun playTopHat() {
        if(hasTopHat) {
            println("ding ding ba-da-bing!")
        }
    }

    fun playSnare() {
        if(hasSnare){
            println("bang bang bang");
        }
        
    }

}

fun main(args: Array<String>) {

    val d =DrumKit(true, true)
    d.playTopHat()
    d.playSnare()
    d.playTopHat()

}

// ding ding ba da bing
// bang bang bang
// ding ding ba da bing
