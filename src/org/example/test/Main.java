package org.example.test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Серенити", "Дасти",
                new ArrayList<String>() {{
                    add("Писать Дасти-Мордасти");
                }});

        System.out.println(longTestString());
    }

    public static String longTestString(){
        String line = "";
        line = line + "line 1\n";
        line = line + "line 2\n";
        line = line + "line 3\n";
        line = line + "line 4\n";
        line = line + "line 5\n";
        return line;
    }
}