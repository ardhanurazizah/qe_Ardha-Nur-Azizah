package Pertemuan_3;

import java.util.HashSet;
import java.util.Set;

public class Tugas5 {
    public static void main(String[] args) {
        Set<Integer> angka = new HashSet<>();
        int[] array1 = {2, 3, 3, 3, 6, 9, 9};

        for (int i = 0; i < array1.length; i++) {
            angka.add(array1[i]);
        }
        System.out.println(angka.size());
    }
}
