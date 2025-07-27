import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("The year is before the Gregorian calendar was introduced.");
        } else {
            if (year % 4 != 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 100 != 0) {
                System.out.println("Leap Year");
            } else if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        }
    }
}
