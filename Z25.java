package lab1_java;

public class Z25 {
    static void main() {
        Z25 main = new Z25();
        System.out.println(main.max3(1, 2, 3));
    }
    public int max3 (int x, int y, int z) {
        int maxNum = x;
        if (maxNum < y) {maxNum = y;}
        if (maxNum < z) {maxNum = z;}
        return maxNum;
    }
}
