package kz.zhelezyaka.combinator;

import kz.zhelezyaka.combinator.CustomerRegistrationValidator.ValidationResult;

import java.time.LocalDate;

import static kz.zhelezyaka.combinator.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Vladimir",
                "vladimir@gmail.com",
                "+77019876512",
                LocalDate.of(2000, 2, 15));

        final ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);
        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
