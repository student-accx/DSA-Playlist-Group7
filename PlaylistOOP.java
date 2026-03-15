/*
Nama  : Zahra Nazifa Wibowo
NIM   : 2902700820

Program ini merupakan program utama yang digunakan untuk menjalankan
sistem manajemen playlist musik sederhana. Program ini akan
menghubungkan class Lagu, Admin, dan Member untuk menunjukkan
bagaimana konsep Object-Oriented Programming (OOP) bekerja
dalam sebuah sistem sederhana.
*/

public class PlaylistOOP {

    public static void main(String[] args) {

        /*
        Pada bagian ini program membuat sebuah array bernama "playlist"
        yang berfungsi untuk menyimpan kumpulan objek Lagu.

        Array ini memiliki kapasitas sebanyak 5 slot, artinya maksimal
        hanya bisa menyimpan 5 lagu di dalam playlist tersebut.

        Setiap posisi dalam array nantinya dapat berisi object Lagu
        atau masih bernilai null jika belum ada lagu yang dimasukkan.
        */
        Lagu[] playlist = new Lagu[5];


        /*
        Di bagian ini program membuat dua objek user yang berbeda,
        yaitu Admin dan Member.

        Admin memiliki hak akses untuk menambahkan lagu ke dalam playlist,
        sedangkan Member hanya dapat melihat playlist, mencari lagu,
        dan menghitung rata-rata durasi lagu.
        */
        Admin admin = new Admin("Admin");
        Member member = new Member("User");


        /*
        Pada bagian ini dibuat beberapa objek Lagu yang nantinya akan
        dimasukkan ke dalam playlist. Setiap objek Lagu memiliki tiga
        atribut utama yaitu judul lagu, nama artis, dan durasi lagu
        dalam satuan menit.
        */
        Lagu lagu1 = new Lagu("Iris", "Goo Goo Dolls", 4.49);
        Lagu lagu2 = new Lagu("Helena", "My Chemical Romance", 3.23);
        Lagu lagu3 = new Lagu("Bertaruh Pada Api", "Dongker", 4.10);


        /*
        Berikut ini merupakan proses dimana Admin menambahkan lagu
        ke dalam playlist. Method tambahLagu() akan menempatkan
        objek Lagu ke dalam posisi index tertentu pada array playlist.

        Jika posisi tersebut masih kosong maka lagu akan dimasukkan,
        namun jika sudah terisi maka program akan menampilkan pesan
        bahwa slot playlist sudah digunakan.
        */
        admin.tambahLagu(playlist, lagu1, 0);
        admin.tambahLagu(playlist, lagu2, 1);
        admin.tambahLagu(playlist, lagu3, 2);

        System.out.println();


        /*
        Member kemudian menggunakan method lihatPlaylist()
        untuk menampilkan seluruh lagu yang ada dalam playlist.
        Method ini akan melakukan perulangan pada array playlist
        dan menampilkan informasi lagu yang tidak bernilai null.
        */
        member.lihatPlaylist(playlist);

        System.out.println();


        /*
        Selanjutnya Member mencoba mencari lagu berdasarkan judul.
        Method cariLagu() akan melakukan pencarian pada setiap
        elemen array playlist dan membandingkan judul lagu
        yang ada dengan judul yang dicari.
        */
        member.cariLagu(playlist, "Helena");

        System.out.println();


        /*
        Pada bagian ini Member menghitung rata-rata durasi
        dari semua lagu yang terdapat dalam playlist.
        Program akan menjumlahkan seluruh durasi lagu
        kemudian membaginya dengan jumlah lagu yang ada.
        */
        member.hitungRataDurasi(playlist);

        System.out.println();


        /*
        Bagian terakhir menunjukkan konsep polymorphism.
        Method tampilkanAkses() dipanggil dari objek Admin
        dan Member, namun masing-masing class memiliki
        implementasi yang berbeda sesuai dengan hak aksesnya.
        */
        admin.tampilkanAkses();
        member.tampilkanAkses();
    }
}