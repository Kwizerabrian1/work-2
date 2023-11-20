// Experiment 2: Single Inheritance with Shapes

class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("Drawing a " + name);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class ShapeExperiment {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        myCircle.draw();             // Inherited method
        System.out.println("Area: " + myCircle.calculateArea());  // Subclass-specific method
    }
}
