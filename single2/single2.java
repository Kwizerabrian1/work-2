public class single2 {
    public static void main(String[] args) {
        Chair myChair = new Chair("Chair", "Wood");
        myChair.displayType();  // Inherited method
        myChair.sitDown();      // Subclass-specific method
    }
}class FurnitureItem {
    protected String type;

    public FurnitureItem(String type) {
        this.type = type;
    }

    public void displayType() {
        System.out.println("Type of furniture: " + type);
    }
}

class Chair extends FurnitureItem {
    private String material;

    public Chair(String type, String material) {
        super(type);
        this.material = material;
    }

    public void sitDown() {
        System.out.println("Sitting on the " + material + " " + type);
    }
}
