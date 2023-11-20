public class single1 {
    public static void main(String[] args) {
        Shirt myShirt = new Shirt("Shirt", "Blue");
        myShirt.wear();         
        myShirt.displayColor(); 
    }
}
class Garment {
    protected String type;

    public Garment(String type) {
        this.type = type;
    }

    public void wear() {
        System.out.println("Wearing " + type);
    }
}

class Shirt extends Garment {
    private String color;

    public Shirt(String type, String color) {
        super(type);
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Color of the shirt: " + color);
    }
}