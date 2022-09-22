package kz.zhelezyaka.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        final Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(value);

        Optional.ofNullable("vladimir@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> {
                            System.out.println("Cannot send email");
                        });
    }
}
