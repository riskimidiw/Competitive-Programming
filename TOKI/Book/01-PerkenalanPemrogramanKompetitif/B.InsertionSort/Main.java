import java.util.*;

public class Main {

    // (array, index a, index b)
    static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    static void insertionSort(int[] arr, int n) {
        for(int i=1; i<n; i++) {
            int j = i;
            while(j>0 && arr[j] < arr[j-1]) {
                swap(arr, j, j-1);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,21,2};

        insertionSort(arr, arr.length);
        for(int tmp : arr) {
            System.out.print(tmp + " ");
        }
        System.out.println();
    }
}