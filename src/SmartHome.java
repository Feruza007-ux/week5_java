class SmartDevice {
    private String brand;
    private boolean isPowerOn;

    public SmartDevice(String brand) {
        this.brand = brand;
        this.isPowerOn = false;
    }

    public String getBrand() {
        return brand;
    }

    public boolean getIsPowerOn() {
        return isPowerOn;
    }

    public void turnOn() {
        isPowerOn = true;
    }
}

class Hub<T> {

    private T device;

    public void storeDevice(T item) {
        this.device = item;
    }

    public T getDevice() {
        return device;
    }

    public void statusReport() {
        if (device == null) {
            System.out.println("No device");
        } else {
            System.out.println("Connected device : " + device);
        }
    }
}


public class SmartHome {
    public static void main(String[] args){
        SmartDevice myDevice = new SmartDevice("samsung");
        myDevice.turnOn();
        Hub<SmartDevice> hub = new Hub<>();

        hub.storeDevice(myDevice);
        hub.statusReport();

        System.out.println("Brand: " + hub.getDevice().getBrand());
        System.out.println("Powe: " + hub.getDevice().getIsPowerOn());
    }
}
