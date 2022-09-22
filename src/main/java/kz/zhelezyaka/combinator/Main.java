package kz.zhelezyaka.combinator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Vladimir",
                "vladimir@gmail.com",
                "+77019876512",
                LocalDate.of(2000, 2, 15));

        System.out.println(new CustomerValidatorService().isValid(customer));
    }
}
