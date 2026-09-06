package lab1_java;

public class Z41 {
    static void main() {
        Z41 main = new Z41();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(main.findFirst(arr, 2));
    }
    public int findFirst (int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) { return i; }
        }
        return -1;
    }
}
