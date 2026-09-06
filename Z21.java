package lab1_java;

public class Z21 {
    static void main() {
        Z21 main = new Z21();
        System.out.println(main.abs(-15));
    }
    public int abs (int x) {
        if (x > 0) { return x; }
        else { return x * (-1);}
    }
}
