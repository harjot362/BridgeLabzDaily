package July02.Questions;

import java.util.Scanner;

public class maximumElement {
    // public static void main(String[] args) {
    //     int arr[] = {5, 3, 8, 6, 2, 9, 1};
    //     int size = 7; 

    //     int max = arr[0];

    //     for (int i = 1; i < size; i++) {
    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }
    //     }

    //     System.out.println("Maximum element is: " + max);
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element is: " + max);

        sc.close();
    }
}


