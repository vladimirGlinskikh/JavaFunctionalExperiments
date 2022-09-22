package kz.zhelezyaka.combinator;

import java.time.LocalDate;

public class Customer {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dataOfBirth;

    public Customer(String name, String email, String phoneNumber, LocalDate dataOfBirth) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dataOfBirth = dataOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }
}

