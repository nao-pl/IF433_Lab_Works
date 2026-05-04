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

    val ac = run{
        SmartDevice(
            "Daikin Inverter (Kabel  3x2.5)",
            "HVAC",
            false,
            800
        )
    }
    homeDevices.add(ac)

    homeDevices.add(
        SmartDevice(
            "Picolo's Auto Feeder",
            "Pet Care",
            true,
            10
        )
    )
}
