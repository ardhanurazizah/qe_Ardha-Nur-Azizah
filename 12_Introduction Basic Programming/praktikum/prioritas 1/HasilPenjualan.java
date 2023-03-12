import java.util.Scanner;
public class HasilPenjualan {
    public static void main(String[] args) {
        int hargaBeli = 15000;
        int hargaJual = 30000;

        Scanner input = new Scanner(System.in);

        // TODO: cek apakah hasil penjualan mengalami keuntungan / kerugian

        System.out.println("Sampel 1");
        int hasil = hargaJual-hargaBeli;
        if (hargaJual < hargaBeli){
            System.out.println("Penjualan Rugi " + hasil);
        } else if (hargaJual > hargaBeli) {
            System.out.println("Penjualan Untung " + hasil);
        }else {
            System.out.println("Penjualan tidak rugi dan tidak untung");
        }

        System.out.println("==========================================================");
        int hargaBeli1 = 0;
        int hargaJual1 = 0;

        System.out.println("Inputan Harga Secara Manual");
        System.out.println("Harga Beli : ");
        hargaBeli1 = input.nextInt();
        System.out.println("Harga Jual : ");
        hargaJual1 = input.nextInt();

        int hasil1 = hargaJual1-hargaBeli1;
        if (hargaJual1 < hargaBeli1){
            System.out.println("Penjualan Rugi " + hasil1);
        } else if (hargaJual1 > hargaBeli1) {
            System.out.println("Penjualan Untung " + hasil1);
        }else {
            System.out.println("Penjualan tidak rugi dan tidak untung");
        }
    }
}
