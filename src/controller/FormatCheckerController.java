package controller;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.FormatCheckerModel;
import view.FormatCheckerView;

public class FormatCheckerController {
    private FormatCheckerView view;
    private FormatCheckerModel model;

    public FormatCheckerController() {
        view = new FormatCheckerView();
        model = new FormatCheckerModel();
    }

    public void run() {
        System.out.println("Welcome to the Format Checker program!");

        String phone = view.getUserInput("Enter a phone number: ");
        while (true) {
            String phoneErrorMessage = model.checkPhone(phone);
            if (!phoneErrorMessage.isEmpty()) {
                System.out.println("Phone number format error: " + phoneErrorMessage);
                phone = view.getUserInput("Enter a phone number: ");
            } else {
                break;
            }
        }
        
        String email = view.getUserInput("Enter an email address: ");
        while (true) {
            String emailErrorMessage = model.checkEmail(email);
            if (!emailErrorMessage.isEmpty()) {
                System.out.println("Email format error: " + emailErrorMessage);
                email = view.getUserInput("Enter an email address: ");
            } else {
                break;
            }
        } 
        
        
        String date = "";
        Pattern datePattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$");

        while (true) {
            System.out.print("Enter a date (dd/MM/yyyy): ");
            date = view.getUserInput();
            Matcher matcher = datePattern.matcher(date);

            if (!matcher.matches()) {
                System.out.println("Date format error. Please enter a date in the correct format (dd/MM/yyyy).");
        } else {
                String[] dateParts = date.split("/");
                int day = Integer.parseInt(dateParts[0]);
                int month = Integer.parseInt(dateParts[1]);
                int year = Integer.parseInt(dateParts[2]);

                if (day > 0 && day <= 31 && month > 0 && month <= 12 && dateParts[2].length() == 4) {
                    break;
                } else {
                    System.out.println("Date format error: Please enter a valid date.");
                }
            }
        }


        System.out.println("All formats are correct.");
    }
}
