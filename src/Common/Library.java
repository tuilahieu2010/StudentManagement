package common;
import java.util.Scanner;

public class Library {
    private Scanner scanner;

    public Library() {
        scanner = new Scanner(System.in);
    }

    public String getString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public int getInt(String message, int min, int max) {
        int number = -1;
        while (true) {
            System.out.print(message + ": ");
            try {
                String input = scanner.nextLine();
                number = Integer.parseInt(input);
                if (number >= min && number <= max) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + min + " and " + max);
            }
        }
        return number;
    }
}