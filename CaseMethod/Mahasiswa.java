class Mahasiswa {
    String nim, nama, prodi;

    Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    static void header() {
        System.out.printf("%-10s %-15s %-20s\n", "NIM", "Nama", "Prodi");
        System.out.println("-----------------------------------------------------");
    }

    void tampil() {
        System.out.printf("%-10s %-15s %-20s\n", nim, nama, prodi);
    }
}