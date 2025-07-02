package July02.Questions;

public class uniqueElements {

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5};

        System.out.println("Unique elements are:");
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


