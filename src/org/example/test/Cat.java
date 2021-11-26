package org.example.test;
import java.util.List;

public class Cat {
    private String catName;
    private String catOwner;
    private List<String> habits;

    public Cat(String catName, String catOwner, List<String> habits) {
        this.catName = catName;
        this.catOwner = catOwner;
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "cat{" +
                "catname='" + catName + '\'' +
                ", catowner='" + catOwner + '\'' +
                ", habits=" + habits +
                '}';
    }
}

