package lab1_java;

public class Z33 {
    static void main() {
        Z33 main = new Z33();
        System.out.println(main.chet(10));
    }
    public String chet (int x) {
        String resUlt = "";
        for (int i = 0; i <= x; i += 2) {
            resUlt += i + " ";
        }
        return resUlt;
    }
}
