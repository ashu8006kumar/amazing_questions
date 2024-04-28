package relation.inheritance;

/**
 * Main class to demonstrate inheritance and behavior of Animal and Dog.
 */
public class TestInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Demonstrates inherited method
        myDog.bark(); // Demonstrates class-specific method
    }
}