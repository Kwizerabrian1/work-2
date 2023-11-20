public class multiple2 {
    public static void main(String[] args) {
        FuelEfficientCar myCar = new FuelEfficientCar("Honda");
        myCar.start();         
        myCar.refuel();         
        myCar.stop();          
    }
}
interface Engine {
    void start();
    void stop();
}

interface FuelSystem {
    void refuel();
}

class FuelEfficientCar implements Engine, FuelSystem {
    private String brand;

    public FuelEfficientCar(String brand) {
        this.brand = brand;
    }

    
    public void start() {
        System.out.println("Starting the fuel-efficient " + brand + " car engine.");
    }

   
    public void stop() {
        System.out.println("Stopping the fuel-efficient " + brand + " car engine.");
    }

    
    public void refuel() {
        System.out.println("Refueling the fuel-efficient " + brand + " car.");
    }
}