package lab1_java;

public class Z42 {
    static void main() {
        Z42 main = new Z42();
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println(main.findLast(arr, 2));
    }
    public int findLast (int[] arr, int x) {
        int yo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {yo = i;}
        }
        return yo;
    }
}
