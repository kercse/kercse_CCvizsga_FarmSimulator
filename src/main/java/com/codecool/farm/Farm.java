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

        for (int i = 0; i < animalList.size(); i++) {
            animalStatus.add("There is a " + animalList.get(i).getSize() + " sized "
                    + animalList.get(i).getSpecies(animalList.get(i)) + "in the farm.");
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
