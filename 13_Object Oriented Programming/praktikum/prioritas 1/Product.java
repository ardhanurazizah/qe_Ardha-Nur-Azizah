package Pertemuan_2;

public class Product {
    String nama, deskripsi;
    int harga,jumlah;

    void setNama(String nm){
        nama = nm;
    }
    String getNama(){
        return nama;
    }
    void setDeskripsi(String ds){
        deskripsi = ds;
    }
    String getDeskripsi(){
        return deskripsi;
    }
    void setHarga(int hr){
        harga = hr;
    }
    int getHarga(){
        return harga;
    }
    void setJumlah(int jl){
        jumlah = jl;
    }
    int getJumlah(){
        return jumlah;
    }
}
