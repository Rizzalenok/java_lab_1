package lab1_java;

public class Z34 {
    static void main() {
        Z34 main = new Z34();
        System.out.println(main.pow(2, 5));
    }
    public int pow (int x, int y) {
        int xy = 1;
        for (int i = 1; i <= y; i++) {
            xy = xy * x;
        }
        return xy;
    }
}