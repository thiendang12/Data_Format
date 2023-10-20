package model;
import Common.Validation;

public class FormatCheckerModel {
    public String checkPhone(String phone) {
        return Validation.validatePhone(phone);
    }

    public String checkDate(String date) {
        return Validation.validateDate(date);
    }

    public String checkEmail(String email) {
        return Validation.validateEmail(email);
    }
}
