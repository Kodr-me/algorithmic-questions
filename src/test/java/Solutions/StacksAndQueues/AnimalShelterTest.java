package Solutions.StacksAndQueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalShelterTest {

    @Test
    public void testingEnqueue() {
        AnimalShelter animalShelter = new AnimalShelter();
        Animal dog1 = new Animal(AnimalType.DOG, "Firulais");
        animalShelter.enqueue(dog1);
        assertEquals(dog1.hashCode(), animalShelter.dequeueDog().hashCode());
    }

    @Test
    public void testingEnqueue2() {
        AnimalShelter animalShelter = new AnimalShelter();
        Animal cat1 = new Animal(AnimalType.CAT, "Kitty");
        animalShelter.enqueue(cat1);
        assertEquals(cat1.hashCode(), animalShelter.dequeueCat().hashCode());
    }

    @Test
    public void testingAnimalShelter() {
        AnimalShelter animalShelter = new AnimalShelter();
        Animal dog1 = new Animal(AnimalType.DOG, "Firulais");
        Animal dog2 = new Animal(AnimalType.DOG, "Ramona");
        Animal dog3 = new Animal(AnimalType.DOG, "Pepita");

        Animal cat1 = new Animal(AnimalType.CAT, "Kitty");
        Animal cat2 = new Animal(AnimalType.CAT, "Gibby");
        Animal cat3 = new Animal(AnimalType.CAT, "Mish");

        animalShelter.enqueue(dog1);
        animalShelter.enqueue(cat1);
        animalShelter.enqueue(cat2);
        animalShelter.enqueue(dog2);
        animalShelter.enqueue(dog3);
        animalShelter.enqueue(cat3);

        assertEquals(dog1.hashCode(), animalShelter.dequeueAny().hashCode());
        assertEquals(dog2.hashCode(), animalShelter.dequeueDog().hashCode());
        assertEquals(cat1.hashCode(), animalShelter.dequeueAny().hashCode());
        assertEquals(cat2.hashCode(), animalShelter.dequeueAny().hashCode());
        assertEquals(dog3.hashCode(), animalShelter.dequeueAny().hashCode());
        assertEquals(cat3.hashCode(), animalShelter.dequeueAny().hashCode());
    }
}
