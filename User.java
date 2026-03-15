/*
Nama  : Giorgio Wilson Wong
NIM   : 2902692705
*/

class User {
    protected String nama;
    /*Constructor untuk class User di sini kita menerima parameter berupa
     nama user lalu menyimpannya ke dalam atribut "nama". Tujuannya
     constructor ini adalah supaya setiap object User yang dibuat
     langsung memiliki identitas namasejak awal pembuatan object tersebut*/
    public User(String nama) {
        this.nama = nama;}
    /*Method getter untuk mengambil atau mengakses nilai dari atribut nama.
     Getter digunakan karena atribut dibuat tidak langsung diakses dari luar
     class.Jadi ketika program lain membutuhkan nama user, method ini yang
     akan dipanggil untuk mengambil nilai tersebut.*/
    public String getNama() {
        return nama;
    }
    /* Method setter untuk mengubah atau memperbarui nilai dari atribut nama.
     Method ini memungkinkan perubahan nama user setelah object dibuat
     misalnya jika terjadi perubahan data atau ingin memperbarui informasi user.
    */
    public void setNama(String nama) {
        this.nama = nama;
    }
    /*Method tampilkanAkses() digunakan untuk menunjukkan jenis akses
     yang dimiliki oleh user biasa. Pada class dasar ini, akses yang dimiliki
     masih bersifat umum atau dasar saja.Method ini nantinya akan dioverride
     oleh class turunan seperti Admin atau Member agar dapat menunjukkan
     akses yang berbeda sesuai dengan peran masing-masing.*/
    public void tampilkanAkses() {
        System.out.println("User memiliki akses dasar.");
    }
}