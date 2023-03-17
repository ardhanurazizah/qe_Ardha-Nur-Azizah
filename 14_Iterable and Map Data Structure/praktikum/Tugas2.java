package Pertemuan_3;
import java.util.ArrayList;
import java.util.List;

public class Tugas2 {
    public static void main(String[] args) {
        String input = "76523752";
        List<Character> output = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (input.indexOf(a) == input.lastIndexOf(a)) {
                output.add(a);
            }
        }

        System.out.println(output);
    }

}
