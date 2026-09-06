package lab1_java;

public class Z15 {
    static void main() {
        Z15 main = new Z15();
        System.out.println(main.is2Digits(851));
    }
    public boolean is2Digits (int x) {
        return (100 > x) && (x > 9);
    }
}
