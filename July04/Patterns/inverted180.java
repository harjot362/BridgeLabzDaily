package July04.Patterns;

public class inverted180 {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     for(int j=i;j<5;j++){ //i to 4.
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){ //1 to i.
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        for(int i=1;i<=5;i++){
            for(int j =1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
