package kz.zhelezyaka.imperative;

import java.util.ArrayList;
import java.util.List;

import static kz.zhelezyaka.imperative.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vladimir", MALE),
                new Person("Svetlana", FEMALE),
                new Person("Nikolay", MALE),
                new Person("John", MALE),
                new Person("Roxana", FEMALE));

        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", gender=" + gender + '}';
        }
    }
}
