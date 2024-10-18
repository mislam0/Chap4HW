package Exercise3;

public class IllegalTriangleSideException extends Exception {
    public IllegalTriangleSideException() {
        super("Invalid triangle sides: Sum of any two sides must be greater than the third side");
    }

    public IllegalTriangleSideException(String message) {
        super(message);
    }
}