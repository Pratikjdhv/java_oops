class Car {  // Class name should start with uppercase
    String brand;
    String model;
    int year;

    // Constructor to initialize object
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// add one comment line 

public class Ex1 {  // Class name should start with uppercase
    public static void main(String[] args) {
        Car c1 = new Car("Lamborghini", "Beta", 2024); // Using constructor
        c1.show();
    }
}
