package Exercise1;

import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public int getIntegerInput(String prompt) throws NumberFormatException {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

    public void closeScanner() {
        scanner.close();
    }
}