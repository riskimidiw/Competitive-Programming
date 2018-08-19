import java.util.*;

public class Main {

    static List<Integer> findDivisibleSubsequence(int[] A, int n) {
        List<Integer> index = new ArrayList<>();
        int[] sum = new int[n+1];
        sum[0] = 0;
        for(int i=1; i<=n; i++) {
            sum[i] = sum[i-1] + A[i-1];
        }

        int[] seenInIndex = new int[n];
        Arrays.fill(seenInIndex, -1);

        for(int i=0; i<=n; i++) {
            if(seenInIndex[sum[i] % n] == -1) {
                seenInIndex[sum[i] % n] = i;
            }else {
                int a = seenInIndex[sum[i] % n];
                int b = i;
                for(int j=a+1; j<=b; j++) {
                    index.add(j);
                }
                return index;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3};

        for(int tmp: findDivisibleSubsequence(arr, arr.length)) {
            System.out.println(tmp);
        }
     }
}