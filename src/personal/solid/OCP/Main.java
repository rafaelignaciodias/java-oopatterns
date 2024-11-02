package personal.solid.OCP;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5), // Circle with radius 5
                new Square(4)   // Square with side 4
        };

        ShapeAreaCalculator calculator = new ShapeAreaCalculator();
        double totalArea = calculator.totalArea(shapes);
        System.out.println("Total Area: " + totalArea); // Outputs the total area
    }
}
