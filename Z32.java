package lab1_java;

public class Z32 {
    static void main() {
        Z32 main = new Z32();
        System.out.println(main.listNums(5));
    }
    public String listNums (int x) {
        String resUlt = "";
        for (int i = x; i >= 0; i--) {
            resUlt += i + " ";
        }
        return resUlt;
    }
}
