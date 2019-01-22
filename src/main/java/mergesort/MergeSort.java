package mergesort;

public class MergeSort {

    public static int[] leastToGreatest (int[] inputArray) {
        if (inputArray.length < 2) return inputArray;
        int[] halfOne = new int[(int)Math.ceil((double)inputArray.length/2)];
        int[] halfTwo = new int[(int)Math.floor((double)inputArray.length/2)];
        for (int i = 0; i < Math.ceil((double)inputArray.length/2); i++) {
            if (i != halfOne.length) halfOne[i] = inputArray[i];
            if (i != halfTwo.length) halfTwo[i] = inputArray[i + halfOne.length];
        }
        return merge(leastToGreatest(halfOne), leastToGreatest(halfTwo));

    }

    private static int[] merge (int[] arrayOne, int[] arrayTwo) {
        int positionOne = 0;
        int positionTwo = 0;
        int[] mergedArray = new int[arrayOne.length + arrayTwo.length];
        for (int i = 0; i < mergedArray.length; i++) {
            if (positionOne == arrayOne.length) {
                mergedArray[i] = arrayTwo[positionTwo];
                positionTwo++;
            } else if (positionTwo == arrayTwo.length) {
                mergedArray[i] = arrayOne[positionOne];
                positionOne++;
            } else if (arrayOne[positionOne] > arrayTwo[positionTwo]) {
                mergedArray[i] = arrayTwo[positionTwo];
                positionTwo++;
            } else if (arrayOne[positionOne] < arrayTwo[positionTwo]) {
                mergedArray[i] = arrayOne[positionOne];
                positionOne++;
            }
        }

        return mergedArray;

    }

}
