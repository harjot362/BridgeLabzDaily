package July04.Patterns;

public class rectangle {
    public static void main(String[] args) {
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        int n =6;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i + "");
            }
            System.out.println();
        }
    }
    
}
/* 

* * * * * 
* * * * * 
* * * * * 
* * * * *

*/