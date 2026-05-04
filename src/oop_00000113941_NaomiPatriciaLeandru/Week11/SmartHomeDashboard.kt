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

    SmartDevice(
        name="Ezviz Outdoor",
        category = "Camera"
    ).apply{
        isOnline = true
        powerLoad = 5
    }.also{
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}
