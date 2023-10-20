package Common;

import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;

public class Validation {
    public static String validatePhone(String phone) {
        if (!phone.matches("\\d+")) {
            return "Phone number must be numbers.";
        } else if (phone.length() != 10) {
            return "Phone number must be 10 digits.";
        }
        return "";
    }

    public static String validateDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        try {
            dateFormat.parse(date);
            return "";
        } catch (ParseException e) {
            return "Date must be in the correct format (dd/MM/yyyy).";
        }
    }

    public static String validateEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            return "Email must be in the correct format.";
        }
        return "";
    }

    public int checkInputIntLimit(int i, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
