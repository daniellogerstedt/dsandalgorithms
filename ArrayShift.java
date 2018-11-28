import java.util.Arrays;

public class ArrayShift {

    /*  This first static is the main for execution of code.
     *  In this case it contains a declared number and array for testing and a system print line for execution of insertNumber method
     */
    public static void main (String[] args) {
        int N = 3;
        int[] testArr = new int[] {1, 2, 4, 5};
        System.out.println(Arrays.toString(insertNumber(testArr, N)));
    }

    /*
        Below is the insertNumber method which takes a number and puts it into an array in numerical position.
     */
    public static int[] insertNumber (int[] arr, int num) {
        int[] answerArray = new int[arr.length + 1];
        boolean inserted = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num && inserted == false) {
                answerArray[i] = num;
                inserted = true;
            }
            if (inserted == true) {
                answerArray[i + 1] = arr[i];
            } else answerArray[i] = arr[i];
        }
        return answerArray;
    }
}