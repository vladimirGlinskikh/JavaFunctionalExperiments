package kz.zhelezyaka.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        System.out.println(increment(0));
        System.out.println(incrementByOneFunction.apply(1));
        System.out.println(multipleByTen.apply(increment(2)));
        System.out.println(incrementByOneFunction.andThen(multipleByTen).apply(4));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multipleByTen = number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }
}
