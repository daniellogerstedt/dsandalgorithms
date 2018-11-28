import java.util.Arrays;

public class ArrayReverse {
    public static void main (String[] args) {
        String[] arr1 = new String[4];
        arr1[0] = "a";
        arr1[1] = "b";
        arr1[2] = "c";
        arr1[3] = "d";
        System.out.println(Arrays.toString(arr1));
        arr1 = reverse(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static String[] reverseArray(String[] arr) {
        for (int i = 0; i < arr.length/2; i++ ) {
            String temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
