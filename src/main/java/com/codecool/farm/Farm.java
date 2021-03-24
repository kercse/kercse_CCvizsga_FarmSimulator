package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    List<Animal> animalList;

    public List<Animal> getAnimals() {
        return animalList;
    }

    List<String> getStatus() {

        List<String> animalStatus = new ArrayList<>();

        for (Animal animal : animalList) {
            String status = "There is a " + animal.getSize() + " sized " + animal.getClass().getSimpleName().toLowerCase() + " in the farm.";
            animalStatus.add(status);
        }
        return animalStatus;
    }


    public Farm(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void feedAnimals() {
        for (Animal animal : animalList) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        animalList.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return animalList.size() == 0;
    }
}
