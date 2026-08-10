// Parent Class
class Shape {
    // Void method to be overridden
    public void printType() {
        System.out.println("Generic Shape");
    }
    
    // Return method to be overridden
    public double getArea(double height, double base) {
        return 0.0;
    }
}

// Child Class implementing Overriding and Overloading
class Triangle extends Shape {
    
    // 1. Overriding the void method
    @Override
    public void printType() {
        System.out.println("This is a Triangle");
    }

    // 2. Overriding the return method (Area formula: height * base / 2)
    @Override
    public double getArea(double height, double base) {
        return (height * base) / 2.0;
    }

    // 3. Overloaded void method (different parameters)
    public void printType(String name) {
        System.out.println("This is a " + name + " Triangle");
    }

    // 4. Overloaded return method (different parameters - handles integers)
    public int getArea(int height, int base) {
        return (height * base) / 2;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create an object of Triangle
        Triangle myTriangle = new Triangle();
        
        // Testing Overridden Methods
        myTriangle.printType(); 
        System.out.println("Area (Double): " + myTriangle.getArea(5.0, 4.0));
        
        // Testing Overloaded Methods
        myTriangle.printType("Isosceles");
        System.out.println("Area (Int): " + myTriangle.getArea(10, 6));
    }
}
