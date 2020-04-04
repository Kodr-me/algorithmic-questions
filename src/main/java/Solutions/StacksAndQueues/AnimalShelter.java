package Solutions.StacksAndQueues;

import java.util.ArrayList;
import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<Animal> dogList = new LinkedList<>();
    private LinkedList<Animal> catList = new LinkedList<>();
    private ArrayList<Animal> order = new ArrayList<>();

    public void enqueue(Animal animal) {
        switch (animal.animalType) {
            case DOG:
                dogList.add(animal);
            case CAT:
                catList.add(animal);
            default:
                order.add(animal);
        }
    }

    public Animal dequeueDog() {
        Animal dog = dogList.removeFirst();
        order.remove(dog);
        return dog;
    }

    public Animal dequeueCat() {
        Animal cat = catList.removeFirst();
        order.remove(cat);
        return cat;
    }

    public Animal dequeueAny() {
        Animal animal = order.remove(0);

        switch (animal.animalType) {
            case DOG:
                dogList.remove(animal);
            case CAT:
                catList.remove(animal);
        }
        return animal;
    }
}
