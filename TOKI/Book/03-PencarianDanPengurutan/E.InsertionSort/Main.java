public class Main {

    public static void insertionSort(int[] arr) {
        int pos, tmp;

        for(int i=0; i<arr.length; i++) {
            pos = i;
            while(pos > 0 && arr[pos] < arr[pos-1]) {
                tmp = arr[pos-1];
                arr[pos-1] = arr[pos];
                arr[pos] = tmp;
                pos--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 10, 20, 8, 1};

        insertionSort(arr);
        for(int tmp: arr) {
            System.out.println(tmp);
        }
    }
}