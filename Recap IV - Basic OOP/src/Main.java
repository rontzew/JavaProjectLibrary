import Vehicle.vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Make of the car: ");
        String make = sc.nextLine();
        System.out.print("VIN of the vehicle: ");
        String vin = sc.nextLine();
        System.out.print("License plate of the vehicle: ");
        String plate = sc.nextLine();
        Vehicle.vehicle mom = new vehicle(make, vin, plate);
        System.out.print(mom.isVinValid(true));
        mom.sellVehicle(plate, mom.lastSoldOnYear);

    }
}