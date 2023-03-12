public class PolaSegitiga {

    public static void printAsterisk(int n) {
        // TODO: complete this code
        int x = 5;
        for (int i = 1; i <= x; i++){
            for (int j = 4; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print('*');
            }
            for (int l = 1; l <= i - 1; l++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printAsterisk(5);
    }
}
