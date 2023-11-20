public class interface1 {
    public static void main(String[] args) {
        Shirt myShirt = new Shirt("Nike", "Medium");
        myShirt.putOn();
        myShirt.tuckIn();
        myShirt.takeOff();
    }
}
interface Wearable {
    void putOn();
    void takeOff();
}

class Shirt implements Wearable {
    private String brand;
    private String size;

    public Shirt(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }


    public void putOn() {
        System.out.println("Putting on a " + size + " " + brand + " shirt.");
    }

    public void takeOff() {
        System.out.println("Taking off the " + size + " " + brand + " shirt.");
    }

    public void tuckIn() {
        System.out.println("Tucking in the " + brand + " shirt.");
    }
}