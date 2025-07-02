package July02.Questions;
 import java.util.Scanner;
public class sumAndAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int sum = 0;


        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; // adding to sum
        }


        double average = (double) sum / size;

        // Output
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        sc.close();
    }
}
