package quicksort;

// Quicksort researched at https://en.wikipedia.org/wiki/Quicksort

public class QuickSort {

    public static void sort(int[] inputArr, int high, int low) {
        if (low < high) {
            int pivotPoint = placePivot(inputArr, high, low);
            sort(inputArr, pivotPoint - 1, low);
            sort(inputArr, high, pivotPoint + 1);
        }



    }

    private static int placePivot (int[] arr, int hi, int lo) {

        int pivot = arr[hi];
        int holder;
        int bottom = lo;
        int top = hi - 1;
        while (bottom <= top) {
            if (arr[top + 1] < arr[top]) {
                holder = arr[top];
                arr[top] = arr[top + 1];
                arr[top + 1] = holder;
                top--;
            } else {
                if (arr[bottom] > pivot) {
                    holder = arr[top];
                    arr[top + 1] = arr[bottom];
                    arr[top] = pivot;
                    arr[bottom] = holder;
                    top--;
                }
                bottom++;
            }
        }
        return top + 1;



    }

}
