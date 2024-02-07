import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Type in your car name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.print("Type in your car Maximum Speed: ");
        int maxSpeed = Integer.parseInt(input.nextLine());

        System.out.print("Type in your car Year of Make: ");
        int yearOfMake = Integer.parseInt(input.nextLine());

        Car Vehicle = new Car(maxSpeed, name, yearOfMake);
        Vehicle.CarName();
        Vehicle.CarMaxSpeed();
        Vehicle.CarYear();
        }
    }