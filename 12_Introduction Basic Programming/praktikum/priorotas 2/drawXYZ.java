import java.util.Scanner;
public class drawXYZ {
    public static void main(String[] args) {
        int i,j,k = 0;
        int a = 5;
        for(i=1; i<=a; i++) {
            for(j=1; j<=a; j++) {
                k++;
                if (k % 3 == 0) {
                    System.out.print("X");
                } else if (k % 2 == 0) {
                    System.out.print("Z");
                }else {
                    System.out.print("Y");
                }
            }
            System.out.println();
        }
    }
}


