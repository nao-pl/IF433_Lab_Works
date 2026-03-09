package oop_00000113941_NaomiPatriciaLeandru.Week06

fun main(){
    val smartLamp = SmartLamp("1", "Ruang Tamu")
    val smartSpeaker = SmartSpeaker("2", "Google Nest Dapur")
    val smartCCTV = SmartCCTV("3", "Esviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(smartLamp)
    hub.addDevice(smartSpeaker)
    hub.addDevice(smartCCTV)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}

