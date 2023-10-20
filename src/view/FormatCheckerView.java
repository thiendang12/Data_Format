package view;
import java.util.Scanner;

public class FormatCheckerView {
    private Scanner scanner;

    public FormatCheckerView() {
        scanner = new Scanner(System.in);
    }

    public String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void displayValidationResults(String phoneError, String emailError, String dateError) {
        System.out.println("Validation Results:");
        if (!phoneError.isEmpty()) {
            System.out.println("Phone: " + phoneError);
        }
        if (!emailError.isEmpty()) {
            System.out.println("Email: " + emailError);
        }
        if (!dateError.isEmpty()) {
            System.out.println("Date: " + dateError);
        }
    }

        public String getUserInput() {
        return scanner.nextLine();
    }

}

