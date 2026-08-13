package tutorial_7;

public class Applience {
    abstract class Appliance {

    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand : " + brand);
    }

    public void turnOn() {
        System.out.println("Power ON");
    }

    public void turnOff() {
        System.out.println("Power OFF");
    }

    public abstract void operate();
}
}
