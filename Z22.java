package lab1_java;

public class Z22 {
    static void main() {
        Z22 main = new Z22();
        System.out.println(main.safeDiv(12, 5));
    }
    public double safeDiv (int x, int y) {
        if (y == 0) {return 0D;}
        else {return (double) x / y;}
    }
}
