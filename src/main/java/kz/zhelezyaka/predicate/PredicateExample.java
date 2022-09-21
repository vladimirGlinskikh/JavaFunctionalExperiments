package kz.zhelezyaka.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("+7000000000"));
        System.out.println(isPhoneNumberValid("+8000080000"));

        System.out.println("--------------------------");

        System.out.println(isPhoneNumberValidPredicate.test("+7000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("+7000000"));

        System.out.println("---------------------------");

        System.out.println(isPhoneNumberValidPredicate.and(containsNumberThree).test("+7000000003"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumberThree).test("+70000000083"));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+7") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("+7") && phoneNumber.length() == 11;

    static Predicate<String> containsNumberThree = phoneNumber ->
            phoneNumber.contains("3");
}
