package kz.zhelezyaka.biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        Customer vladimir = new Customer("Vladimir", "7019898");
        greetCustomerConsumer.accept(vladimir, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber : "*******"));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
