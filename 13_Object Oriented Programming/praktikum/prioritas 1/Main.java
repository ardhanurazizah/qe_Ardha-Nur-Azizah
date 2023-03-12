package Pertemuan_2;

public class Main {
    public static void main(String[] args) {
        Product pr = new Product();
        Product pr1 = new Product();
        Product pr2 = new Product();

        System.out.println("===============");
        System.out.println("INFO PRODUK");
        pr.setNama("coffe");
        pr.setDeskripsi("this is coffe");
        pr.setHarga(15000);
        pr.setJumlah(10);
        System.out.println("nama : " + pr.getNama());
        System.out.println("deskripsi : " + pr.getDeskripsi());
        System.out.println("harga : " + pr.getHarga());
        System.out.println("jumlah : " + pr.getJumlah());
        System.out.println("===============");

        System.out.println("===============");
        System.out.println("INFO PRODUK");
        pr1.setNama("milk");
        pr1.setDeskripsi("this is fresh milk");
        pr1.setHarga(25000);
        pr1.setJumlah(10);
        System.out.println("nama : " + pr1.getNama());
        System.out.println("deskripsi : " + pr1.getDeskripsi());
        System.out.println("harga : " + pr1.getHarga());
        System.out.println("jumlah : " + pr1.getJumlah());
        System.out.println("===============");

        System.out.println("===============");
        System.out.println("INFO PRODUK");
        pr2.setNama("apple juice");
        pr2.setDeskripsi("this is juice");
        pr2.setHarga(18000);
        pr2.setJumlah(20);
        System.out.println("nama : " + pr2.getNama());
        System.out.println("deskripsi : " + pr2.getDeskripsi());
        System.out.println("harga : " + pr2.getHarga());
        System.out.println("jumlah : " + pr2.getJumlah());
        System.out.println("===============");
    }
}
