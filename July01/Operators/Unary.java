package July01.Operators;

public class Unary {
    public static void main(String[] args) {
        int a=10;
        // int b=-a [gives negative a i.e. -10]
        // int b=+a [gives positive b i.e. 10]


        int b=10;

        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));

    }
}
