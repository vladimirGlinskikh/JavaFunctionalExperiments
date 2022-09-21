package kz.zhelezyaka.supplier;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println(getDBCConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static String getDBCConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectionUrlSupplier = ()
            -> List.of("jdbc://localhost:5432/users");

}
