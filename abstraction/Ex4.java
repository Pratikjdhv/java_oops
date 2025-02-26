// 2. Interface (Full Abstraction)
// An interface:

// Provides 100% abstraction (only method signatures, no implementation).
// Only contains abstract methods (by default) and constants.
// A class implements an interface using the implements keyword.
// Supports multiple inheritance (a class can implement multiple interfaces).


interface Animal {
    void makeSound();  // Abstract method (no body)
}

// Implementing the interface
class Dog implements Animal {
    public void makeSound() {  // Must provide implementation
        System.out.println("Dog barks.");
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Calls Dog's implementation
    }
}
