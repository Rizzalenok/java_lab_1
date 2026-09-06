package lab1_java;

public class Z31 {
    static void main() {
        Z31 main = new Z31();
        System.out.println(main.listNums(5));
    }
    public String listNums (int x) {
        String resUlt = "";
        for (int i = 0; i <= x; i++) {
            resUlt += i + " ";
        }
        return resUlt;
    }
}
