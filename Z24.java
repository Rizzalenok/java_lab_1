package lab1_java;

public class Z24 {
    static void main() {
        Z24 main = new Z24();
        System.out.println(main.makeDecision(2, 1));
    }
    public String makeDecision (int x, int y) {
        if (x < y) {return x + "<" + y;}
        else if (x > y) {return x + ">" + y;}
        else {return x + "=" + y;}
    }
}
