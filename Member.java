/*
Nama  : Wahyu Tri Anggoro
NIM   : 2902692554

Class Member merupakan turunan dari class User.
Class ini digunakan oleh pengguna playlist untuk melihat daftar lagu,
mencari lagu berdasarkan judul, serta menghitung rata-rata durasi lagu
yang ada di dalam playlist.
*/

class Member extends User {

    public Member(String nama) {
        super(nama); // memanggil constructor dari class User
    }

    // Method untuk menampilkan seluruh lagu yang ada di dalam playlist
    public void lihatPlaylist(Lagu[] playlist) {
        System.out.println("Daftar Lagu dalam Playlist:");
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null) {
                playlist[i].tampilkanInfo(); // menampilkan info lagu
            }
        }
    }

    // Method untuk mencari lagu berdasarkan judul
    public void cariLagu(Lagu[] playlist, String judul) {
        boolean ditemukan = false;

        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null && playlist[i].getJudul().equalsIgnoreCase(judul)) {
                System.out.println("Lagu ditemukan:");
                playlist[i].tampilkanInfo(); // menampilkan lagu yang ditemukan
                ditemukan = true;
                break;
            }
        }

        // jika lagu tidak ditemukan
        if (!ditemukan) {
            System.out.println("Lagu tidak ditemukan.");
        }
    }

    // Method untuk menghitung rata-rata durasi semua lagu dalam playlist
    public void hitungRataDurasi(Lagu[] playlist) {
        double total = 0;
        int jumlah = 0;

        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null) {
                total += playlist[i].getDurasi(); // menjumlahkan durasi lagu
                jumlah++;
            }
        }

        // menghitung rata-rata durasi lagu
        if (jumlah > 0) {
            double rata = total / jumlah;
            System.out.println("Rata-rata durasi lagu: " + rata + " menit");
        } else {
            System.out.println("Playlist kosong.");
        }
    }

    // Implementasi polymorphism dari method tampilkanAkses() pada class User
    @Override
    public void tampilkanAkses() {
        System.out.println("Member dapat melihat playlist, mencari lagu, dan menghitung rata-rata durasi.");
    }
}
