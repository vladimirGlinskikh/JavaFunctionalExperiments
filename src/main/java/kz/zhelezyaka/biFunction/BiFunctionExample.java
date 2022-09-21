package kz.zhelezyaka.biFunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        System.out.println(incrementByOneAndMultiply(5, 500));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 500));

    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
