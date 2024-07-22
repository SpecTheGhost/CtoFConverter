import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number for the gallons of gas in the tank.");
            }
        } while (!done);
        done = false;
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number for the fuel efficiency.");
            }
        } while (!done);
        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number for the price of gas per gallon.");
            }
        } while (!done);
        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double maxDistance = gallons * fuelEfficiency;
        System.out.printf("The cost per 100 miles is: $%.2f\n", costPer100Miles);
        System.out.printf("The car can go %.2f miles with the gas in the tank.\n", maxDistance);
    }
}
