import java.util.Scanner;

public class Appliances {
    public static void main(String[] args) {
        double inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cost per kilowatt-hour in cents: ");
        inData = scan.nextInt();
        double cents = inData / 100;
        System.out.println("Enter kilowatt-hours used per year: ");
        inData = scan.nextInt();
        double hours = inData;
        System.out.println("Annual cost: " + hours * cents);
    }
}