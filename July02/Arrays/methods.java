package July02.Arrays;

public class methods {

    // Main method
    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 25};

        System.out.println("Original Array:");
        printArray(arr);

        modifyArray(arr);

        System.out.println("Array after modification:");
        printArray(arr);

        int newArr[] = getArray();
        System.out.println("Array returned from method:");
        printArray(newArr);
    }

    // Method to print array elements
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println(); // for new line
    }

    // Method to modify array elements
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] + 5; // adding 5 to each element
    }

    // Method to return an array
    public static int[] getArray() {
        int temp[] = {100, 200, 300};
        return temp;
    }
}