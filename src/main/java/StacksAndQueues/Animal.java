package StacksAndQueues;

class Animal {
    AnimalType animalType;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Animal(AnimalType animalType, String name) {
        this.animalType = animalType;
        this.name = name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }
}
