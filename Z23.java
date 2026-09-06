package lab1_java;

public class Z23 {
    static void main() {
        Z23 main = new Z23();
        System.out.print(main.is35(33));
    }
    public boolean is35 (int x) {
        if (x % 15 == 0) {return false;}
        else if (x % 3 == 0) {return true;}
        else if (x % 5 == 0) {return true;}
        else {return false;}
    }
}
