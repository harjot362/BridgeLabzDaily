package June30;

public class ExplicitCasting {
    public static void main(String[] args) {
        double d = 99.99;
        float f = (float) d; // double to float
        long l = (long) f;   // float to long
        int i = (int) l;     // long to int
        short s = (short) i; // int to short
        byte b = (byte) s;   // short to byte

        int num = 65;
        char c = (char) num; // int to char

        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);
        System.out.println("int to char: " + c);
    }
}
