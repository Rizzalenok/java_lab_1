package lab1_java;
import java.util.Arrays;

public class Z45 {
    static void main() {
        Z45 main = new Z45();
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        System.out.println(Arrays.toString(main.add(arr, ins, 3)));
    }
    public int[] add (int[] arr, int[] ins, int pos) {
        int[] arr1 = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, arr1, 0, pos);
        int j = 0;
        for (int i = pos; i < pos + ins.length; i++) {
            arr1[i] = ins[j];
            j += 1;
        }
        System.arraycopy(arr, pos, arr1, pos + ins.length, arr.length - pos);
        return arr1;
    }
}
