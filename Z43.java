package lab1_java;

public class Z43 {
    static void main() {
        Z43 main = new Z43();
        int[] arr = {1, -2, -7, 4, 2, 2, 5};
        System.out.println(main.maxAbs(arr));
    }
    public int maxAbs (int[] arr) {
        int yo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (yo < Math.abs(arr[i])) { yo = arr[i]; }
        }
        return yo;
    }
}
