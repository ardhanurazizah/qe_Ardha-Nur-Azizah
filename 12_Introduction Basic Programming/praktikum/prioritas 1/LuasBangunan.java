public class LuasBangunan {
    public static void main(String[] args){
        //segitiga
        float alas = 20;
        float tinggi = 25;

        double segitiga = 0.5*alas*tinggi;
        System.out.println("Luas Segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah " + segitiga);

        //persegi panjang
        float panjang = 40;
        float lebar = 6;

        double persegipanjang = panjang*lebar;
        System.out.println("Luas Persegi Panjang dengan panjang " + panjang + " dan lebar " + lebar + " adalah " + persegipanjang);

        //lingkaran
        float jari = 7;

        double lingkaran = 3.14*jari*jari;
        System.out.println("Luas Lingkaran dengan jari " + jari + " adalah " + lingkaran);

    }
}
