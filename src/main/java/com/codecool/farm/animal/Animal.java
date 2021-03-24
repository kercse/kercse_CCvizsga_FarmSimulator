package com.codecool.farm.animal;

public abstract class Animal {

    int size;

    public String getSpecies(Animal animal) {
        String species;
        int startingSize = animal.getSize();
        animal.feed();
        if (animal.getSize() == startingSize + 2) {
            species = "cattle ";
        }
        species = "pig ";
        animal.size = startingSize;
        return species;
    }

    public int getSize() {
        return size;
    }

    public Animal() {
        size = 0;
    }

    public void feed() {

    }
}
