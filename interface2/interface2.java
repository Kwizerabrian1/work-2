public class interface2 {
    public static void main(String[] args) {
        Sneakers mySneakers = new Sneakers("Adidas", 9);
        mySneakers.putOn();
        mySneakers.laceUp();
        mySneakers.takeOff();
    }
}
interface Footwear {
    void putOn();
    void takeOff();
}

class Sneakers implements Footwear {
    private String brand;
    private int size;

    public Sneakers(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

 
    public void putOn() {
        System.out.println("Putting on a pair of " + brand + " sneakers (Size " + size + ").");
    }

   
    public void takeOff() {
        System.out.println("Taking off the pair of " + brand + " sneakers (Size " + size + ").");
    }

    public void laceUp() {
        System.out.println("Lacing up the " + brand + " sneakers.");
    }
}