package org.example.test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Серенити", "Дасти",
                new ArrayList<String>(){{
                    add("Писать Дасти-Мордасти");
                }});

        System.out.println(cat.toString());
    }
}
