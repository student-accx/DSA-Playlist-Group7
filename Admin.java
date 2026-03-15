/*
Nama  : Giorgio 
NIM   : (NIM Gio)
*/

class Admin extends User {
    /*Constructor utk Class Admin merupakan turunan dari
      class User makanya constructor yg ini memanggil constructor milik User
      menggunakan keyword "super".Dengan begitu atribut nama yang dimiliki
      User juga dimiliki oleh Admin..
      */
    public Admin(String nama) {
        super(nama);}

    //Method tambahLagu digunakan untuk menambahkan objek Lagu ke dalam playlist yang disimpan dalam bentuk array.

     /*Logikanya adalah:
     - Program pertama2x memeriksa apakah index yang diberikan masih berada dalam batas ukuran array playlist agar tidak terjadi error
     -jika index masih valid maka program akan mengecek apakah posisi array tersebut masih kosong atau sudah berisi lagu
     -Jika posisi masih kosong (null), maka lagu baru dapat dimasukkan ke dalam array tersebut
     -Jika posisi sudah terisi lagu lain, maka program tidak akan mengganti lagu tersebut dan hanya menampilkan pesan bahwa slot sudah terisi
     -jika index di luar batas array, maka program akan memberi pesan bahwa index yang dimasukkan tidak valid
     */
    public void tambahLagu(Lagu[] playlist, Lagu laguBaru, int index) {
        if (index >= 0 && index < playlist.length) {
            if (playlist[index] == null) {
                playlist[index] = laguBaru;
                System.out.println("Lagu berhasil ditambahkan oleh admin: " + laguBaru.getJudul());
            } else {
                System.out.println("Slot playlist pada index tersebut sudah terisi.");
            }
        } else {
            System.out.println("Index tidak valid.");}}
    /*Method ini merupakan override dari method tampilkanAkses()
     yang ada pada class User. Konsepnya menunjukkan polymorphism. Dimana method yang sama dapat
     memiliki implementasi yang berbeda pada class turunan. Untuk class Admin akses yang ditampilkan
     berbeda karena admin memiliki hak tambahan yaitu dapat menambahkan lagu ke dalam playlist. */
    @Override
    public void tampilkanAkses() {
        System.out.println("Admin dapat menambah lagu ke playlist.");
    }
}