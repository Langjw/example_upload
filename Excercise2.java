import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        double inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of seconds: ");
        inData = scan.nextInt();
        double t = inData * inData;
        double g = 32.174;
        double distance = 0.5 * t * g;
        System.out.println("Distance: " + distance);
    }
}