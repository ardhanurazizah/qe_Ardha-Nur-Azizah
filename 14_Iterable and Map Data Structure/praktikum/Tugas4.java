package Pertemuan_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tugas4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 5, 10, 16};

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            boolean unique = true;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                result.add(arr1[i]);
            }
        }

        System.out.println(Arrays.toString(result.toArray()));
    }
}
