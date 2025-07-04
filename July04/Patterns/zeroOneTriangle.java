package July04.Patterns;

public class zeroOneTriangle {
    public static void main(String[] args){
        int n =6;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i + "");
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i <= n; i++) {
            
            for (int j = 0; j <= i; j++) {
                
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " "); 
                } else {
                    System.out.print(0 + " "); 
                }
            }
            System.out.println(); 
        }
    }    
}

