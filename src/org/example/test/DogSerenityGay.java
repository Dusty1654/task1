package org.example.test;

import java.util.List;

public class DogSerenityGay extends Animal {

    private float lifeTime;

    public DogSerenityGay(String name, String owner, float lifeTime, List<String> habits) {
        super(name, owner, habits);
        this.lifeTime = lifeTime;
    }

    public float getLifeTime() {
        return lifeTime;
    }
}
