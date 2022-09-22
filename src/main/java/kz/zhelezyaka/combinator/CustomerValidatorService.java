package kz.zhelezyaka.combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+7");
    }

    private boolean isAdult(LocalDate dataOfBirth) {
        return Period.between(dataOfBirth, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNumber()) &&
                isAdult(customer.getDataOfBirth());
    }
}
