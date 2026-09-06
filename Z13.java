package lab1_java;

public class Z13 {
    static void main() {
        Z13 main = new Z13();
        System.out.println(main.charToNum('1'));
    }
    public int charToNum (char x) {
        return x - '0';
    }
}
