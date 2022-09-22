package kz.zhelezyaka.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static kz.zhelezyaka.streams.Gender.FEMALE;
import static kz.zhelezyaka.streams.Gender.MALE;

public class StreamExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vladimir", MALE),
                new Person("Svetlana", FEMALE),
                new Person("Nikolay", MALE),
                new Person("John", MALE),
                new Person("Roxana", FEMALE));

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
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
