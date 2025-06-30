package June30;

import java.util.Scanner;

public class CtoF {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F = " + celsius + "°C");

        sc.close();
     }
}
