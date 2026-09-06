package lab1_java;

public class Z12 {
    static void main() {
        Z12 main = new Z12();
        int x = 9292;
        System.out.println(main.sumLastNums(x));
    }
    public int sumLastNums (int x) {
        int lastDvaNum = x % 100;
        int lastNum = x % 10;
        return (lastDvaNum - lastNum) / 10 + lastNum;
    }
}
