import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();

        System.out.println("-------------------------------------");
        System.out.println("Welcome to our Vehicle Rental System");
        System.out.println("--------------------------------------");


        while (true){
            System.out.println("1 Rant a Car");
            System.out.println("2 Rant a Bike");
            System.out.println("3 Rant a Truck");
            System.out.println("4 view rented vehicles");
            System.out.println("5 Exit");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter Car Model: ");
                    String model = "";
                    model = input.nextLine();
                    System.out.println("Enter Rent days: ");
                    int days = input.nextInt();
                    Car car = new Car(model,days);
                    rentVehicles(car,rentedVehicles);
                        break;

                case 2:
                    System.out.print("Enter Bike brand: ");
                    String brand = input.nextLine();
                    System.out.println("Enter Rent hours: ");
                    int hours = input.nextInt();
                    Bike bike = new Bike(brand,hours);
                    rentVehicles(bike,rentedVehicles);

                        break;
                case 3:
                    System.out.print("Enter Truck type: ");
                    String type = input.nextLine();
                    System.out.println("Enter Rent weeks: ");
                    int weeks = input.nextInt();
                    Truck truck = new Truck(type,weeks);
                    rentVehicles(truck,rentedVehicles);
                        break;
                case 4:
                        System.out.println("Viewing rented vehicles");
                        for (Vehicle vehicle : rentedVehicles){
                            if (vehicle instanceof Car) {
                                rentDetails((Car) vehicle);
                            } else if (vehicle instanceof Bike) {
                                rentDetails((Bike) vehicle);
                            } else if (vehicle instanceof Truck) {
                                rentDetails((Truck) vehicle);
                            }
                        }
                        break;
                case 5:
                        return;

                default:
                        System.out.println("Invalid choice");
                        break;
            }


        }
    }



    public static void rentVehicles(Car car ,ArrayList<Vehicle> rentedVehicles) {

        car.setRented(true);
        rentedVehicles.add(car);
        System.out.println("--------------");
        System.out.println("Car rented");
        System.out.println("--------------");



    }
    public static void rentVehicles(Bike bike ,ArrayList<Vehicle> rentedVehicles) {
        bike.setRented(true);
        rentedVehicles.add(bike);
        System.out.println("--------------");
        System.out.println("bike rented");
        System.out.println("--------------");


    }
    public static void rentVehicles(Truck truck ,ArrayList<Vehicle> rentedVehicles) {

        truck.setRented(true);
        rentedVehicles.add(truck);
        System.out.println("--------------");
        System.out.println("truck rented");
        System.out.println("--------------");

    }



    public static void rentDetails (Car car) {
        car.displayDetails();
    }
    public static void rentDetails (Bike bike) {
        bike.displayDetails();
    }
    public static void rentDetails (Truck truck) {
        truck.displayDetails();
    }







}