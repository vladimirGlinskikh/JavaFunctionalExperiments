package kz.zhelezyaka.declarative;

import java.util.List;
import java.util.stream.Collectors;

import static kz.zhelezyaka.declarative.Gender.FEMALE;
import static kz.zhelezyaka.declarative.Gender.MALE;


public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vladimir", MALE),
                new Person("Svetlana", FEMALE),
                new Person("Nikolay", MALE),
                new Person("John", MALE),
                new Person("Roxana", FEMALE));

        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
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
