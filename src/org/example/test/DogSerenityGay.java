package org.example.test;

import java.util.List;

public class DogSerenityGay {
    private String name;
    private String owner;
    private float lifeTime;
    private List<String> habits;

    public DogSerenityGay(String name, String owner, float lifeTime, List<String> habits){
        this.name = name;
        this.owner = owner;
        this.lifeTime = lifeTime;
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "DogSerenityGay{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", lifeTime=" + lifeTime +
                ", habits=" + habits +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public float getLifeTime() {
        return lifeTime;
    }

    public List<String> getHabits() {
        return habits;
    }
}
