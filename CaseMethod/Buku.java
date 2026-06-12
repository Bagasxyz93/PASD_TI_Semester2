class Buku {
    String kode, judul;
    int tahun;

    Buku(String kode, String judul, int tahun) {
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
    }

    static void header() {
        System.out.printf("%-10s %-20s %-10s\n", "Kode", "Judul", "Tahun");
        System.out.println("-----------------------------------------------");
    }

    void tampil() {
        System.out.printf("%-10s %-20s %-10d\n", kode, judul, tahun);
    }
}