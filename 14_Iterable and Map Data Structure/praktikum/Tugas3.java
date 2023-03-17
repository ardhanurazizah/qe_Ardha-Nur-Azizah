package Pertemuan_3;

import java.util.Arrays;

public class Tugas3 {
    public static int[] findTwoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i, j};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int target = 6;
        int[] result = findTwoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
