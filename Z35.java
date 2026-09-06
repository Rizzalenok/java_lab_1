package lab1_java;

public class Z35 {
    static void main() {
        Z35 main = new Z35();
        System.out.println(main.numLen(12345L));
    }
    public int numLen (long x) {
        String y = Long.toString(x);
        int xy = 0;
        for (int i = 0; i < y.length(); i++) {
            xy += 1;
        }
        return xy;
    }
}
