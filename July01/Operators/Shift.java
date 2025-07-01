package July01.Operators;

public class Shift {
    public static void main(String[] args) {
        int a = 5;       // 0000 0101
        int b = 20;      // 0001 0100
        int c = -8;      // 1111 1000 (in 32-bit signed binary)

        // Left Shift
        System.out.println("a << 1: " + (a << 1)); // 5 * 2 = 10

        // Right Shift
        System.out.println("b >> 2: " + (b >> 2)); // 20 / 4 = 5

        // Unsigned Right Shift
        System.out.println("c >>> 2: " + (c >>> 2)); // zero se bhr deta hai, large positive number
    }
}
