class Car {
    private String brand;
    private String model;
    private int price;

    // Constructor to initialize values
    Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        setPrice(price); // Using setter to apply validation
    }

    // Setter methods
    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void setPrice(int newPrice) {
        if (newPrice > 0) {
            price = newPrice;
        } else {
            System.out.println("Price should be positive!");
        }
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Car c1 = new Car("Lamborghini", "Beta", 100000000); // Using constructor
        System.out.println("Car Brand: " + c1.getBrand());
        System.out.println("Car Model: " + c1.getModel());
        System.out.println("Car Price: " + c1.getPrice());
    }
}
