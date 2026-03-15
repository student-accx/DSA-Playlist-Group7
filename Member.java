/*
Tugas Kelompok 1 - Data Structures and Algorithm Analysis

Nama  : Wahyu Tri Anggoro
NIM   : 2902692554
Bagian: Class Member

Deskripsi:
Class Member digunakan untuk melihat playlist, mencari lagu,
dan menghitung rata-rata durasi lagu dalam playlist.
*/

class Member extends User {

    public Member(String nama) {
        super(nama);
    }

    public void lihatPlaylist(Lagu[] playlist) {
        System.out.println("Daftar Lagu dalam Playlist:");
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null) {
                playlist[i].tampilkanInfo();
            }
        }
    }

    public void cariLagu(Lagu[] playlist, String judul) {
        boolean ditemukan = false;

        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null && playlist[i].getJudul().equalsIgnoreCase(judul)) {
                System.out.println("Lagu ditemukan:");
                playlist[i].tampilkanInfo();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Lagu tidak ditemukan.");
        }
    }

    public void hitungRataDurasi(Lagu[] playlist) {
        double total = 0;
        int jumlah = 0;

        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null) {
                total += playlist[i].getDurasi();
                jumlah++;
            }
        }

        if (jumlah > 0) {
            double rata = total / jumlah;
            System.out.println("Rata-rata durasi lagu: " + rata + " menit");
        } else {
            System.out.println("Playlist kosong.");
        }
    }

    @Override
    public void tampilkanAkses() {
        System.out.println("Member dapat melihat playlist, mencari lagu, dan menghitung rata-rata durasi.");
    }
}