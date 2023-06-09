# Rangkuman Materi REST API Testing

Berikut ini rangkuman materi yang telah dipelajari sebelumnya :
* API Testing adalah tipe software testing yang memvalidasi API, terjadi pada Business Layer, Software Layer yang paling kritis karena menghubungkan Presentation Layer dan Database Layer. Macam-macamnya terdapat functionality testing, load testing, dan security testing
* Approach dari API Testing yaitu, mengerti fungsi API, mengaplikasikan teknik testing, perencanaan parameter untuk api, menjalankan test case dan membandingkan hasil yang di dapatkan. 
* Best practice dari penggunaan API Testing adalah mengelompokkan test case ke dalam beberapa kategori, memberi judul yang sesuai, hati-hati dalam melakukan test penghapusan, memikirkan pembuatan test case kombinasi input pada API
* Pengujian Metode HTTP: REST API menggunakan metode HTTP seperti GET, POST, PUT, DELETE, dll. Pengujian harus memastikan bahwa setiap metode berperilaku sesuai harapan dan menghasilkan respons yang tepat.
* Pengujian Parameter: API mungkin menerima parameter query, parameter body, atau parameter lainnya. Pengujian harus mencakup pengujian untuk memastikan bahwa parameter diterima dengan benar dan menghasilkan respons yang sesuai.
* Pengujian Respons: Pengujian harus memeriksa respons yang diterima dari API untuk memastikan bahwa mereka sesuai dengan spesifikasi yang diharapkan. Ini termasuk memeriksa kode status HTTP, format data (seperti JSON atau XML), dan struktur respons.
* Pengujian Error Handling: API harus mengelola kesalahan dengan benar dan memberikan respons yang sesuai. Pengujian harus memeriksa bagaimana API menangani kesalahan dan memberikan pesan kesalahan yang tepat kepada pengguna.
* Pengujian Autentikasi dan Otorisasi: Jika API membutuhkan autentikasi atau otorisasi, pengujian harus mencakup pengujian untuk memastikan bahwa proses autentikasi berjalan dengan baik dan hanya pengguna yang diotorisasi yang dapat mengakses sumber daya yang sesuai.
* Pengujian Performa: Pengujian performa harus dilakukan untuk mengukur waktu respons API, waktu pemrosesan, dan beban kerja yang dapat ditangani oleh API. Hal ini penting untuk memastikan bahwa API mampu menangani lalu lintas yang tinggi dengan kinerja yang baik.
* Pengujian Keamanan: Pengujian keamanan harus dilakukan untuk memeriksa apakah API rentan terhadap serangan seperti injeksi SQL, serangan XSS, atau serangan lainnya. Pengujian keamanan ini penting untuk melindungi API dari ancaman keamanan potensial.Pengujian Metode HTTP: REST API menggunakan metode HTTP seperti GET, POST, PUT, DELETE, dll. Pengujian harus memastikan bahwa setiap metode berperilaku sesuai harapan dan menghasilkan respons yang tepat.
* Pengujian Parameter: API mungkin menerima parameter query, parameter body, atau parameter lainnya. Pengujian harus mencakup pengujian untuk memastikan bahwa parameter diterima dengan benar dan menghasilkan respons yang sesuai.

Pengujian Respons: Pengujian harus memeriksa respons yang diterima dari API untuk memastikan bahwa mereka sesuai dengan spesifikasi yang diharapkan. Ini termasuk memeriksa kode status HTTP, format data (seperti JSON atau XML), dan struktur respons.

Pengujian Error Handling: API harus mengelola kesalahan dengan benar dan memberikan respons yang sesuai. Pengujian harus memeriksa bagaimana API menangani kesalahan dan memberikan pesan kesalahan yang tepat kepada pengguna.

Pengujian Autentikasi dan Otorisasi: Jika API membutuhkan autentikasi atau otorisasi, pengujian harus mencakup pengujian untuk memastikan bahwa proses autentikasi berjalan dengan baik dan hanya pengguna yang diotorisasi yang dapat mengakses sumber daya yang sesuai.

Pengujian Performa: Pengujian performa harus dilakukan untuk mengukur waktu respons API, waktu pemrosesan, dan beban kerja yang dapat ditangani oleh API. Hal ini penting untuk memastikan bahwa API mampu menangani lalu lintas yang tinggi dengan kinerja yang baik.

Pengujian Keamanan: Pengujian keamanan harus dilakukan untuk memeriksa apakah API rentan terhadap serangan seperti injeksi SQL, serangan XSS, atau serangan lainnya. Pengujian keamanan ini penting untuk melindungi API dari ancaman keamanan potensial.