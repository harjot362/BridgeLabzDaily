package June30;

public class ImplicitCasting {
    public static void main(String[] args) {
       byte b = 10;
        short s = b;      // byte to short
        int i = s;        // short to int
        long l = i;       // int to long
        float f = l;      // long to float
        double d = f;     // float to double

        char c = 'A';
        int ascii = c;    // char to int

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c + ", ascii: " + ascii);
    }
}
