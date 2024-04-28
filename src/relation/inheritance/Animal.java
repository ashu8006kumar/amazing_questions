package relation.inheritance;

/**
 * Represents a generic animal with basic behaviors like eating.
 */
public class Animal {
    /**
     * Makes the animal eat.
     * This is a general behavior applicable to all animals.
     */
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

/**
 * Represents a Dog, which is a specific type of Animal.
 * This is an example of an 'is-a' relationship in Java, utilizing inheritance.
 */
class Dog extends Animal {
    /**
     * Makes the dog bark.
     * This is a specific behavior for dogs.
     */
    public void bark() {
        System.out.println("The dog barks.");
    }
}


