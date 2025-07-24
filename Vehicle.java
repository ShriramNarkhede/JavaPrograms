public class Vehicle {
    // Instance variables
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean isRunning;

    // Constructor
    public Vehicle(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isRunning = false;
    }

    // Method to start the vehicle
    public void start() {
        if (!isRunning) {
            System.out.println(color + " " + year + " " + make + " " + model + " is starting.");
            isRunning = true;
        } else {
            System.out.println("The vehicle is already running.");
        }
    }

    // Method to stop the vehicle
    public void stop() {
        if (isRunning) {
            System.out.println(color + " " + year + " " + make + " " + model + " is stopping.");
            isRunning = false;
        } else {
            System.out.println("The vehicle is already stopped.");
        }
    }

    // Method to honk the horn
    public void honk() {
        System.out.println(color + " " + year + " " + make + " " + model + " is honking!");
    }

    // Method to get information about the vehicle
    public void info() {
        System.out.println("Vehicle Info: " + year + " " + make + " " + model + ", Color: " + color + ", Running: " + isRunning);
    }

    public static void main(String[] args) {
        // Create instances of the Vehicle class
        Vehicle car1 = new Vehicle("Toyota", "Camry", 2022, "Blue");
        Vehicle car2 = new Vehicle("Honda", "Civic", 2023, "Red");

        // Interact with the vehicles
        car1.start();
        car2.start();
        car1.honk();
        car2.stop();

        // Display vehicle information
        car1.info();
        car2.info();
    }
}
