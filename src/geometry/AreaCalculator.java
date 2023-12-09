package geometry;

public class AreaCalculator {
	public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle using Heron's formula
    public double calculateArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate the area of a rectangle
        double rectangleArea = calculator.calculateArea(5.0, 3.0);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Calculate the area of a circle
        double circleArea = calculator.calculateArea(4.0);
        System.out.println("Area of the circle: " + circleArea);

        // Calculate the area of a triangle
        double triangleArea = calculator.calculateArea(3.0, 4.0, 5.0);
        System.out.println("Area of the triangle: " + triangleArea);
    }


	}


