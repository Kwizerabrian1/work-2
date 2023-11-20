public class multiple1 {
    public static void main(String[] args) {
        Sparrow mySparrow = new Sparrow("House Sparrow");
        mySparrow.chirp();  
        mySparrow.fly();    
    }
}
interface Bird {
    void chirp();
}

interface Flying {
    void fly();
}

class Sparrow implements Bird, Flying {
    private String species;

    public Sparrow(String species) {
        this.species = species;
    }

    
    public void chirp() {
        System.out.println("Chirping - I'm a " + species);
    }

   
    public void fly() {
        System.out.println("Flying high - I'm a " + species);
    }
}
