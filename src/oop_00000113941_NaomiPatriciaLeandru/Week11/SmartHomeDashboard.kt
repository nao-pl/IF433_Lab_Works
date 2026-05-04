fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(
        name = "Philips WiZ Living Room",
        category = "Lighting"
    ).apply{
        isOnline = true
        powerLoad = 12
        homeDevices.add(this)
    }
}
