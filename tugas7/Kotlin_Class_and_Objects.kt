class Lamp {

    //property (data member)
    private var isOn: Boolean = false

    //Member Fungtion
    fun turnOn(){
        isOn = true
    }

    // Member Fungtion
    fun turnOff(){
        isOn = false
    }

    fun displayLightStatus(lamp: String){
        if(isOn == true)
            println("$lamp lamp is on.")
        else
            println("$lamp lamp is off.")
    }
}

fun main(args: Array<String>){

    val l1 = Lamp()
    val l2 = Lamp()

    l1.turnOn()
    l2.turnOff()

    l1.displayLightStatus("l1")
    l1.displayLightStatus("l2")
}