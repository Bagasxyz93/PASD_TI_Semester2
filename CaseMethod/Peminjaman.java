class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int denda;
    int kategoriPeminjaman;
    

    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam, int kategoriPeminjaman) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.denda = hitungDenda();
        this.kategoriPeminjaman = kategoriPeminjaman();
    }

    int kategoriPeminjaman() {
        if (lamaPinjam <= 3) {
            System.out.println("Ringan");
            return 1; 
        } else if (lamaPinjam <= 5) {
            System.out.println("Sedang");
            return 2; 
        } else {
            System.out.println("Berat");
            return 3;
        }
    }

    int hitungDenda() {
        int batas = 5;
        int dendaPerHari = 2000;

        if (lamaPinjam > batas) {
            return (lamaPinjam - batas) * dendaPerHari;
        } else {
            return 0;
        }
    }

    static void header() {
        System.out.printf("%-10s %-15s %-20s %-10s %-10s %-10s\n",
                "NIM", "Nama", "Buku", "Hari", "Denda", "Kategori Peminjaman");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    void tampil() {
        System.out.printf("%-10s %-15s %-20s %-10d %-10d %10d \n",
                mhs.nim, mhs.nama, buku.judul, lamaPinjam, denda, kategoriPeminjaman);
    }
}