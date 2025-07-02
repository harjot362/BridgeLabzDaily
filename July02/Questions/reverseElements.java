package July02.Questions;

public class reverseElements {

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        reverseArray(originalArray);

        System.out.println("Reversed Array: ");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

