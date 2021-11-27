package org.example.test;

import java.util.List;

public class Animal{
    private String name;
    private String owner;
    private List<String> habits;


    public Animal(String name, String owner, List<String> habits) {
        this.name = name;
        this.owner = owner;
        this.habits = habits;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public List<String> getHabits() {
        return habits;
    }
}
