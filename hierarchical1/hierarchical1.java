public class hierarchical1 {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", "XPS 13");
        myLaptop.powerOn();
        myLaptop.openLid();
        myLaptop.sleep();

        Desktop myDesktop = new Desktop("HP", "Tower");
        myDesktop.powerOn();
        myDesktop.assemble();
        myDesktop.upgradeRAM();
    }
}
class Computer {
    protected String brand;

    public Computer(String brand) {
        this.brand = brand;
    }

    public void powerOn() {
        System.out.println("Powering on the " + brand + " computer.");
    }

    public void shutDown() {
        System.out.println("Shutting down the " + brand + " computer.");
    }
}

class Laptop extends Computer {
    private String model;

    public Laptop(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public void openLid() {
        System.out.println("Opening the lid of the " + brand + " " + model + " laptop.");
    }

    public void sleep() {
        System.out.println("Putting the " + brand + " laptop to sleep mode.");
    }
}

class Desktop extends Computer {
    private String formFactor;

    public Desktop(String brand, String formFactor) {
        super(brand);
        this.formFactor = formFactor;
    }

    public void assemble() {
        System.out.println("Assembling the components of the " + brand + " desktop.");
    }

    public void upgradeRAM() {
        System.out.println("Upgrading the RAM of the " + brand + " desktop.");
    }
}