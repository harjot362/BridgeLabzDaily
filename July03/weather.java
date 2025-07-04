package July03;

import java.util.Scanner;

public class weather {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        if(a>40){
            System.out.println("Hot");
        }else if(a>=20 && a<=30){
            System.out.println("normal");
        }else{
            System.out.println("Cool");
        }
        sc.close();
    }
}
