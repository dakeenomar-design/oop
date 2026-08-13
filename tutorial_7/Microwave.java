package tutorial_7;

import tutorial_7.Applience.Appliance;

public class Microwave {
    public class Microwave extends Appliance {

    public Microwave(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Heating food...");
    }
}
}
