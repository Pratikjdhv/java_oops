// 🔹 What is Abstraction?
// Abstraction is the process of hiding implementation details and showing only essential features to the user.

// It helps in reducing complexity.
// It is implemented using abstract classes and interfaces in Java.
// 🔹 1. Abstract Class (Partial Abstraction)
// An abstract class in Java:

// Cannot be instantiated (you cannot create objects of an abstract class).
// Can have both abstract (without body) and non-abstract methods (with body).
// Helps in code reusability.

abstract class vehicle {
    abstract void startengine ();
    void stopengine (){
        System.out.println("engine stop ...");
    }
}

class car extends vehicle {
    void startengine(){
        System.out.println("engine started...");
    }
}

public class Ex3 {
    public static void main (String [] args ){
        vehicle v1 = new car ();
        v1.startengine();
        v1.stopengine();
    }
}
