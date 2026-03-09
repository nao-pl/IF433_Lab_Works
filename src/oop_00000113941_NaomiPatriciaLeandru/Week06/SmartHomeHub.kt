package oop_00000113941_NaomiPatriciaLeandru.Week06

class SmartHomeHub{
    private val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches(){
        for(device in devices){
            if(device is Switchable){
                device.turnOff()
            }
        }
    }
}