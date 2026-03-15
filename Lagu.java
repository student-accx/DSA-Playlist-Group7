/*
Nama  : Maxwell Lin
NIM   : 2902689521
*/

// Class Lagu digunakan untuk merepresentasikan data setiap lagu dalam playlist
class Lagu {

    // Atribut lagu dibuat private untuk menerapkan konsep enkapsulasi
    private String judul;
    private String artis;
    private double durasi;

    // Constructor digunakan untuk menginisialisasi data lagu saat object dibuat
    public Lagu(String judul, String artis, double durasi) {
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
    }

    // Getter digunakan untuk mengambil nilai judul lagu
    public String getJudul() {
        return judul;
    }

    // Getter untuk mengambil nilai artis
    public String getArtis() {
        return artis;
    }

    // Getter untuk mengambil nilai durasi lagu
    public double getDurasi() {
        return durasi;
    }

    // Setter digunakan untuk mengubah nilai judul lagu
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Setter untuk mengubah nilai artis
    public void setArtis(String artis) {
        this.artis = artis;
    }

    // Setter untuk mengubah durasi lagu
    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }

    // Method ini digunakan untuk menampilkan informasi lagu ke layar
    public void tampilkanInfo() {
        System.out.println("Judul  : " + judul);
        System.out.println("Artis  : " + artis);
        System.out.println("Durasi : " + durasi + " menit");
    }
}
