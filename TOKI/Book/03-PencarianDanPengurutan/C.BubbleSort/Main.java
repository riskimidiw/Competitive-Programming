public class Main {

    public static void bubbleSort(int[] arr) {
        int tmp;

        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j] > arr[j+1]) {
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 10, 20, 8, 1};

        bubbleSort(arr);
        for(int tmp: arr) {
            System.out.println(tmp);
        }
    }
}
