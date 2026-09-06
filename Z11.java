package lab1_java;

public class Z11 {
    static void main() {
        Z11 main = new Z11();
        double x = 125.25D;
        System.out.print(main.fraction(x));
    }
    public double fraction (double x) {
        double y = x % 1;
        return y;
    }
}