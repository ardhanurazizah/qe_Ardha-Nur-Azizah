package Pertemuan_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Tugas6 {
    public static int findMaxSum(int[] arr, int k) {
        int maxSum = 0;
        int Sum = 0;
        int Start = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            Sum += arr[windowEnd];

            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, Sum);
                Sum -= arr[Start];
                Start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int maxSum = findMaxSum(arr, k);

        System.out.println(maxSum);
    }
}
