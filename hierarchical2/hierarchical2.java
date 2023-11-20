public class hierarchical2 {
    public static void main(String[] args) {
        Smartphone mySmartphone = new Smartphone("Samsung", "Galaxy S21");
        mySmartphone.makeCall();
        mySmartphone.sendMessage();
        mySmartphone.browseInternet();

        FeaturePhone myFeaturePhone = new FeaturePhone("Nokia", true);
        myFeaturePhone.makeCall();
        myFeaturePhone.sendMessage();
        myFeaturePhone.playMusic();
    }
}
class Phone {
    protected String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public void makeCall() {
        System.out.println("Making a call using the " + brand + " phone.");
    }

    public void sendMessage() {
        System.out.println("Sending a message using the " + brand + " phone.");
    }
}

class Smartphone extends Phone {
    private String model;

    public Smartphone(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public void browseInternet() {
        System.out.println("Browsing the internet on the " + brand + " " + model + " smartphone.");
    }
}

class FeaturePhone extends Phone {
    private boolean hasPhysicalKeyboard;

    public FeaturePhone(String brand, boolean hasPhysicalKeyboard) {
        super(brand);
        this.hasPhysicalKeyboard = hasPhysicalKeyboard;
    }

    public void playMusic() {
        System.out.println("Playing music on the " + brand + " feature phone.");
    }

    public void takePhotos() {
        System.out.println("Taking photos using the camera on the " + brand + " feature phone.");
    }
}