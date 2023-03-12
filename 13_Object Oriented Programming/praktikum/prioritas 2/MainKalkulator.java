package Pertemuan_2;

public class MainKalkulator {
    public static void main(String[] args) {
        Kalkulator kl = new Kalkulator();

        kl.setAdd(3,4);
        kl.setSubstract(15,4);
        kl.setMultiply(10,10);
        kl.setDivide(12,3);

        System.out.println("Penjumlahan : " + kl.getAdd());
        System.out.println("Pengurangan : " + kl.getSubstract());
        System.out.println("Perkalian : " + kl.getMultiply());
        System.out.println("Pembagian : " + kl.getDevide());
    }
}
