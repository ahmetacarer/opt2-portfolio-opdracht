package com.company;

import java.util.Scanner;

public class Menu {
    private static final Data data = new Data();

    public static void main(String[] args)
    {
        Menu.mainList();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) //add vehicle
        {
            Menu.choice1(scanner);
        }

        else if (choice == 2) //remove vehicle
        {
            Menu.choice2(scanner);
        }

        else if (choice == 3) { //compare vehicle
            Menu.choice3(scanner);

        } else if (choice == 0) {
            System.exit(0);
        }
        main(args);
    }
    private static void addVehicle(Scanner scanner){
        System.out.println("\nEnter vehicle name: ");
        String name = scanner.nextLine();
        System.out.println("\nEnter weight of vehicle (0 if you don't know): ");
        int weight  = scanner.nextInt();
        System.out.println("\nEnter price of vehicle (0 if you don't know): ");
        int price   = scanner.nextInt();
        System.out.println("\nEnter the seating capacity of this vehicle (0 if you don't know): ");
        int seatingCapacity = scanner.nextInt();
        System.out.println("\nEnter number of km per liter/kwh of this vehicle: ");
        int kmPerLiter = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter fuel type of this vehicle: ");
        String fuelType = scanner.nextLine();
        //proberen om de gegevens toe te voegen
        try {
            data.addVehicle(new Vehicle(name, weight, price, seatingCapacity , kmPerLiter , fuelType));
        }
        catch (Exception e){
            System.out.println("\n an exception: " + e + " , vehicle was not added");
        }
    }
    // deze moet ik nog verder verwerken en moet ik
    private static void compareVehicles(Scanner scanner){
        compareList();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("the most cost effictive vehicle is: "+data.getMostCostEffectiveVehicle().getName());
                break;
            case 2:
                System.out.println("the most expensive vehicle is: "+data.getMostExpensiveVehicle().getName());
                break;
            case 3:
                System.out.println("the cheapest vehicle is: "+data.getCheapestVehicle().getName());
                break;
            case 0: break;
            default: compareVehicles(scanner);
        }
    }
    private static void mainList(){
        System.out.printf(
                "\n1) add vehicle" +
                        "\n2) remove vehicle" +
                        "\n3) compare vehicles" +
                        "\n0) stop%n");
    }
    private static void compareList(){
        System.out.printf(
                "\n1) get most cost effective vehicle" +
                        "\n2) get most cost expensive vehicle" +
                        "\n3) get cheapest vehicle" +
                        "\n0) go back%n");
    }

    public static void choice1(Scanner scanner){
        System.out.println("You choose 1");
        scanner.nextLine();
        Menu.addVehicle(scanner);
    }
    public static void choice2(Scanner scanner){
        System.out.println("You chose 2");
        if (data.getVehicles().size() == 0) { System.out.println("You didn't add any vehicles");
            System.out.println("Add vehicles!");
        }
        System.out.println("Enter the name of the vehicle you want to delete");
        scanner.nextLine();
        data.deleteVehicle(scanner.nextLine());
    }

    public static void choice3(Scanner scanner){
        System.out.println("\n\n\nYou chose 3");
        if (data.getVehicles().size() == 0) {
            System.out.println("You didn't add any vehicles");
            System.out.println("Add vehicles!");
            return;
        }
        if (data.getVehicles().size() < 2) {
            System.out.println("You need to add more vehicles");
        }
        Menu.compareVehicles(scanner);
    }


}
