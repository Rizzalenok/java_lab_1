package lab1_java;
import java.util.Arrays;


public class Z44 {
    static void main() {
        Z44 main = new Z44();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(main.add(arr, 9, 3)));
    }
    public int[]add (int[] arr, int x, int pos) {
        int[] arr1 = new int[arr.length + 1];
        System.arraycopy(arr, 0, arr1, 0, pos);
        arr1[pos] = x;
        System.arraycopy(arr, pos, arr1, pos + 1, arr.length - pos);
        return arr1;
    }
}
