package July02.Questions;

public class SecondThirdLargest {
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        int k = 3; // find 3rd largest

        // Sort the array in descending order using selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the Kth largest element
        System.out.println(k + "th largest element is: " + arr[k - 1]);
    }
}

