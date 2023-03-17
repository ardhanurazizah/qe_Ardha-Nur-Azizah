package Pertemuan_3;

import java.util.HashSet;
import java.util.Set;
public class Tugas1 {
    public static void main(String[] args) {
        Set<String> nama = new HashSet<>();
        String[] array1 = {"kazuya", "jin", "lee"};
        String[] array2 = {"kazuya", "feng"};

        for (String name : array1) {
            nama.add(name);
        }
        for (String name : array2) {
            nama.add(name);
        }

        System.out.println(nama);
    }
}
