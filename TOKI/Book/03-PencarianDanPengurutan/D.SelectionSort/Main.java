public class Main {

    public static void selectionSort(int[] arr) {
        int minIndex, tmp;

        for(int i=0; i<arr.length; i++) {
            minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 10, 20, 8, 1};

        selectionSort(arr);
        for(int tmp: arr) {
            System.out.println(tmp);
        }
    }
}