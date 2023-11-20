public class break1 {
    public static void main(String[] args) {
        String[] carBrands = {"Toyota", "Honda", "Ford", "Chevrolet", "Volkswagen"};

        for (String brand : carBrands) {
            if (brand.equals("Chevrolet")) {
                System.out.println("Found the desired car brand: " + brand);
                break;
            }
            System.out.println("Checking car brand: " + brand);
        }
    }
}