// Parent class
class Person {
    String name;
    int age;

    // Constructor to initialize values
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class (inherits from Person)
class Student extends Person {
    int stu_id;

    // Constructor for Student (calling Parent constructor using super)
    Student(String name, int age, int stu_id) {
        super(name, age);  // Calls the constructor of Person
        this.stu_id = stu_id;
    }

    void studetail() {
        System.out.println("Student ID: " + stu_id);
    }
}

// Main class
public class Ex3 {
    public static void main(String[] args) {
        Student s1 = new Student("Pratik", 19, 119); // Passing values dynamically
        s1.details(); // Calls Parent class method
        s1.studetail(); // Calls Student class method
    }
}
