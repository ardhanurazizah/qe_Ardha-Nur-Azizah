public class PlainCipher {
    public static void main(String[] args)
    {
        //  variable
        String a = "SEPULSA OKE";
        int key = 10;
        String[] huruf = new String[26];

        //  isi array huruf
        for(char c = 'A'; c <= 'Z'; c++)
            huruf[c - 65] = String.valueOf(c);

        //  Proses Enkripsi
        String cipher = "";
        loop:
        for(int b = 0; b < a.length(); b++)
        {
            //  cari nomor dari tiap huruf variable kata
            int index_plain = -1;
            for(int c = 0; c < huruf.length; c++)
            {
                // Teknik Penulisan Short Hand If Else
                index_plain = (String.valueOf(a.charAt(b)).equals(huruf[c])) ? c : -1;
                // Jika Ketemu Karakternya
                if(index_plain != -1)
                {
                    // Rumus Enkripsi --> C = (nomor_karakter_plain + key) mod 26
                    cipher += huruf[(index_plain + key) % 26];
                    continue loop;
                }
            }

            //  Jika plain text tidak mengandung huruf maka, langsung dimasukkan ke variable cipher
            //  Misal, spasi atau angka
            cipher += a.charAt(b);
        }


        //  Tampilkan Plain Text
        System.out.println("Plain Text : "+ a);
        //  Tampilkan hasil cipher
        System.out.println("Cipher Text : "+cipher);
    }
}
