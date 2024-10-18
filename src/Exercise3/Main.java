package Exercise3;

public class Main {
    public static void testTriangle(double side1, double side2, double side3) {
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("\nTesting " + triangle);

        try {
            boolean isValid = triangle.checkSides();
            System.out.println("Result: Valid triangle");
        } catch (IllegalTriangleSideException e) {
            System.out.println("Result: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        testTriangle(3.0, 4.0, 5.0);

        testTriangle(1.0, 1.0, 3.0);

        testTriangle(5.0, 5.0, 5.0);
    }
}