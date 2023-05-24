//A Company manufactures Vehicles, which could be a Helicopter, a Car, or a Train depending on the customer’s demand. Each Vehicle instance has a method called move, which prints on the console the nature of movement of the vehicle. For example, the Helicopter Flies in Air, the Car Drives on Road and the Train Runs on Track. Write a program that accepts input from the user on the kind of vehicle the user wants to order, and the system should print out nature of movement. Implement all Java coding best practices to implement this program.

import java.util.Scanner;

// Vehicle class (parent class)
abstract class Vehicle {
    public abstract void move();
}

// Helicopter class (subclass of Vehicle)
class Helicopter extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

// Car class (subclass of Vehicle)
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Car drives on the road.");
    }
}

// Train class (subclass of Vehicle)
class Train extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Train runs on the track.");
    }
}

public class VehicleType {
    public static void main(String[] args) {
        // Accept input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of vehicle (Helicopter/Car/Train): ");
        String vehicleType = scanner.nextLine();
        scanner.close();

        // Create the corresponding vehicle object based on user input
        Vehicle vehicle;
        switch (vehicleType.toLowerCase()) {
            case "helicopter":
                vehicle = new Helicopter();
                break;
            case "car":
                vehicle = new Car();
                break;
            case "train":
                vehicle = new Train();
                break;
            default:
                System.out.println("Invalid vehicle type.");
                return; // Exit the program if an invalid vehicle type is entered
        }

        // Print the nature of movement of the selected vehicle
        vehicle.move();
    }
}

