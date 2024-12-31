// Base class
class Animal {
    public String name;

    // Constructor of Animal class
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called: " + name);
    }

    // Method to make sound
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Subclass
class Dog extends Animal {
    
    // Constructor of Dog class
    public Dog(String name) {
        super(name); // Call the constructor of Animal
        System.out.println("Dog constructor called: " + name);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks.");
    }

    // Method to get the name (to access private field from Animal)
    public String getName() {
        return super.name; // Accessing the private field using super (not directly accessible)
    }
}

// Main class to test the functionality
public class N {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy"); // Creates a Dog instance
        myDog.makeSound();             // Calls overridden method
    }
}
