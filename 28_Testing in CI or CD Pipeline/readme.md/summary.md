# Rangkuman Materi Testing in CI/CD Pipeline

Berikut ini rangkuman materi yang telah dipelajari sebelumnya :

* Continuous Integrtion adalah praktik engembangan software dimana developer merubah code dan melakukan merge ke repository atau penyimpanan secara reguler atau terus menerus dimana nantinya jika ada push atau commit maka automated build dan test akan dijalankan sehingga hasilnya bisa langsung diketahui. Jika terdapat kesalahan maka developer dapat melakukan tindakan dengan memperbaarui code sehingga kualitas dapat terupdate. CI sendiri dapat menyederhanakan tahapan software sehingga issue bisa diperbaiki kembali. Di dalam CI terdapat 3 stage yaitu build, unit test, dan integration test. Jika ketiga tahapan tersebut telah berhasil maka akan dilanjutkan ke CD.
* CD sendiri merupakan proses setelah CI dimana developer telah menjalankan build dan test namun tidak melimpahkan ke environment production. Continuous Development sendiri proses akhir dari CI pepline yang akan rilis ke production. 
* Perbedaan antar CD dengan Continuous Development yaitu, Delivery akan merilis secara manual ke dalam production sedangkan Deployment secara otomatis. CI dapat dikatakan baik dengan cara decoupled stages dengan fokus terhadap satu task, repeatable dengan menggunakan stages secara berulang ulang dan konsisten serta developer dapat menggunakan tools tersebut di local, dan yang terakhir fail fast jika terdapat fail di laine pertama maka task tersebut harus segera fail. Selanjutnya pada CD dapat dikatakan baik dengan cara design with system in mind dengan memikirkan apikasi, infrastruktur, dll pada saat deployment, selanjutnya pipelines dengan meningkatkan confident agar dapat lanjut ke deployment, globally unique versions dengan mengerti tentang perbedaan per state dan dapat mendemokan perbedaan antara current dan future state. 
* Proses dalam CI/CD yaitu, pertama developer akan menulis code yang akan digunakan dan di eksekusi ke version git, llau developer menggbungkan dari awal sampai akhir ke dalam compiler, melkukan testing ke dalam sistem yang telah di buat, dan yang terakhir developer akan mendeploy ke server. 
* Terdapat beberapa manfaat dalam penggunakan CI yaitu, dapat mendeteksi bug lebih cepat dari biasanya, lalu developer dapat dengan mudah dalam memperbaikinya sehingga mengurangi bug saat deployment, dapat mempercepat proses rilis, efisien. Sedangkan manfaat dalam penggunaan CD yaitu, reduce the risk, mengurangi pipelines dari sebuah deployment, mengurangi biaya, automated and transparant proses, bisa merilis future tersebut secara terus menerus. Kekurangan dari CI yaitu menuliskan test secara automated, menyiapkan server, dan sering melakukan merge ke code yang baru. Sedangkan kekuarangan CD yaitu, harus mengerti foundation dari CI, membutuhkan kuaitas yang tinggi, harus sering update dokumentasi.  
* Tools jenkins adalah alat open source yang digunakan untuk otomatisasi proses pengembangan perangkat lunak. Jenkins dapat digunakan untuk membangun, menguji, dan menerapkan perangkat lunak dalam lingkungan yang berbeda dan pada platform yang berbeda. Jenkins juga mendukung integrasi dengan berbagai alat dan layanan, seperti Git, SVN, Mercurial, Amazon EC2, Docker, dan lain-lain. Dalam pengembangan perangkat lunak, Jenkins biasanya digunakan sebagai alat Continuous Integration (CI) dan Continuous Delivery (CD). CI adalah proses penggabungan kode dari beberapa anggota tim dalam satu repositori secara teratur, dan memastikan bahwa setiap perubahan yang dilakukan terintegrasi dengan baik. Sementara itu, CD adalah proses pengiriman perangkat lunak yang dilakukan secara otomatis ke lingkungan produksi setelah melalui serangkaian tahap pengujian dan validasi. Beberapa fitur utama dari Jenkins meliputi: Kemampuan untuk membangun dan menguji kode secara otomatis,Integrasi dengan berbagai alat dan layanan, termasuk Git, SVN, Mercurial, dan Amazon EC2, Kemampuan untuk menentukan berbagai tindakan atau tugas yang harus dijalankan sebagai bagian dari proses CI / CD, Kemampuan untuk mengatur dan menyelesaikan tugas secara otomatis dengan menjadwalkan tugas atau memicu tugas sesuai dengan perubahan kode pada repositori, Jenkins memberikan manfaat besar bagi pengembang dan organisasi dalam hal efisiensi dan kecepatan pengembangan perangkat lunak. Dalam pengembangan perangkat lunak yang kompleks, Jenkins dapat membantu tim pengembang dalam mengelola proses integrasi kode yang kompleks dan seringkali memakan waktu, sehingga mempercepat waktu untuk pengiriman produk yang lebih baik dan stabil.
* Tools Gitlab CI adalah sebuah tool yang digunakan untuk mengotomatisasi proses build, test, dan deployment dari aplikasi yang dikembangkan di GitLab. GitLab CI memungkinkan developer untuk mengeksekusi proses tersebut secara otomatis setiap kali ada perubahan kode di repository GitLab.

Dalam GitLab CI, proses build, test, dan deployment dijalankan melalui job yang terdiri dari serangkaian langkah yang harus dieksekusi secara berurutan. Setiap job harus didefinisikan dalam sebuah file konfigurasi .gitlab-ci.yml yang harus ditempatkan pada root repository GitLab. GitLab CI mendukung berbagai macam bahasa pemrograman dan framework, dan juga mendukung penggunaan container Docker untuk menjalankan proses build dan test secara isolasi. GitLab CI juga memiliki integrasi dengan berbagai tool dan layanan seperti Slack, JIRA, dan AWS, sehingga memudahkan developer dalam mengintegrasikan proses development dengan tools lain yang digunakan dalam organisasi. Dalam GitLab CI, hasil dari proses build, test, dan deployment ditampilkan dalam sebuah dashboard yang dapat diakses oleh seluruh anggota tim. Hal ini memungkinkan tim untuk memantau proses development secara real-time dan mengidentifikasi masalah secara cepat. Dalam keseluruhan, GitLab CI merupakan sebuah tool yang sangat berguna untuk meningkatkan efisiensi dan kecepatan dalam proses development aplikasi. Dengan GitLab CI, developer dapat memastikan bahwa setiap perubahan kode yang dilakukan akan di-build, di-test, dan di-deploy dengan cepat dan akurat.     
* Tools Atlassian Bamboo adalah salah satu alat Continuous Integration (CI) yang membantu dalam mengotomatisasi build, test, dan rilis perangkat lunak secara terus-menerus. Bamboo membantu tim pengembang untuk memastikan bahwa kode yang mereka tulis dapat diuji dan diintegrasikan dengan kode dari anggota tim lainnya sebelum diterapkan ke lingkungan produksi. Bamboo mendukung berbagai bahasa pemrograman, lingkungan pengembangan, dan platform, termasuk Java, .NET, PHP, Ruby, Node.js, Python, iOS, dan Android. Dalam Bamboo, setiap perubahan kode yang di-commit ke repositori dipicu oleh pipeline otomatis, yang terdiri dari satu atau lebih job. Setiap job dapat mengotomatisasi tugas-tugas seperti melakukan build, menjalankan tes otomatis, dan menerapkan perubahan ke lingkungan produksi. Bamboo juga menyediakan fitur pelaporan yang mendetail dan analytics yang membantu tim pengembang untuk memantau performa setiap build dan mengidentifikasi masalah dalam kode mereka. Bamboo juga dapat terintegrasi dengan berbagai alat pengembangan lainnya seperti JIRA, Bitbucket, dan Slack.    
* Tools CircleCI adalah platform otomatisasi pengujian dan pengiriman berkelanjutan (CI/CD) yang membantu pengembang dalam mengotomatiskan alur kerja pengembangan perangkat lunak. CircleCI memungkinkan tim untuk menguji dan mengintegrasikan kode secara otomatis dalam lingkungan yang terisolasi, sehingga mempercepat waktu siklus pengembangan dan meminimalkan risiko kesalahan manusia. Dalam hal pricing, CircleCI menyediakan beberapa pilihan, termasuk plan gratis dan plan berbayar dengan fitur tambahan seperti penyelesaian masalah lebih cepat dan dukungan pelanggan yang lebih baik. CircleCI juga menyediakan integrasi dengan beberapa platform kolaborasi, seperti GitHub dan Bitbucket, sehingga memudahkan tim dalam bekerja bersama dalam mengembangkan perangkat lunak.                         
* Tools AWS CodeBuild adalah layanan manajemen build dan continuous integration yang disediakan oleh Amazon Web Services (AWS). Layanan ini memungkinkan pengguna untuk membangun, menguji, dan merilis kode dengan cepat dan mudah, dengan menggunakan berbagai bahasa pemrograman seperti Java, Python, Go, Ruby, dan lain-lain. AWS CodeBuild dapat terintegrasi dengan berbagai layanan AWS seperti AWS CodeCommit, AWS CodePipeline, dan AWS Elastic Beanstalk, serta berbagai tools pengembangan lain seperti Jenkins, GitHub, dan Bitbucket. Layanan ini juga mendukung penggunaan container Docker untuk menjalankan build, sehingga memungkinkan pengguna untuk menyesuaikan lingkungan build sesuai dengan kebutuhan aplikasi yang sedang dikembangkan.
* Tools GitHub Actions adalah platform otomatisasi yang disediakan oleh GitHub untuk membantu pengembang dalam mengotomatisasi pekerjaan-pakerjaan seperti melakukan build, testing, dan deploy aplikasi secara otomatis. GitHub Actions memungkinkan pengguna untuk membuat workflow dengan mudah menggunakan konfigurasi file YAML dan menjalankan tugas-tugas dalam kontainer Docker atau lingkungan virtual. Salah satu kelebihan dari GitHub Actions adalah integrasi yang erat dengan GitHub, sehingga memudahkan pengguna untuk melakukan integrasi continuous integration (CI) dan continuous deployment (CD) pada repositori GitHub mereka. Selain itu, GitHub Actions juga menyediakan fitur-fitur seperti notification, deploy artifacts, dan melakukan tindakan-tindakan tertentu pada hasil dari pekerjaan otomatisasi yang dilakukan. GitHub Actions tersedia secara gratis untuk semua pengguna GitHub, dengan batasan-batasan tertentu pada jumlah tugas yang dapat dijalankan dalam satu bulan. GitHub Actions juga menyediakan opsi untuk menggunakan lingkungan dan konfigurasi kustom, serta dukungan untuk integrasi dengan layanan-layanan pihak ketiga seperti Amazon Web Services (AWS) dan Microsoft Azure.