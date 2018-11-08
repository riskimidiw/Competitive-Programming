public class Main {

    public static void countingSort(int[] arr) {
        int[] tmp = new int[100000];
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            tmp[arr[i]]++;
        }

        for(int i=0; i<tmp.length; i++) {
            for(int j=0; j<tmp[i]; j++) {
                arr[count++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 10, 20, 8, 1};

        countingSort(arr);
        for(int tmp: arr) {
            System.out.println(tmp);
        }
    }
}