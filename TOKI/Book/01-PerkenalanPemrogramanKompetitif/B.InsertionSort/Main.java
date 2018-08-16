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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr, n);
        for(int tmp : arr) {
            System.out.println(tmp);
        }
    }
}