package Exercise1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputHandler inputHandler = new InputHandler();

        try {
            int num1 = inputHandler.getIntegerInput("Enter the first number: ");
            int num2 = inputHandler.getIntegerInput("Enter the second number: ");

            int result = calculator.add(num1, num2);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer numbers.");
        } finally {
            inputHandler.closeScanner();
        }
    }
}