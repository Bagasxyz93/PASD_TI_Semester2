public class Main {
    public static void main(String[] args) {

        // === OBJECT MAHASISWA ===
        Mahasiswa m1 = new Mahasiswa("22001", "Andi", "TI");
        Mahasiswa m2 = new Mahasiswa("22002", "Budi", "TI");
        Mahasiswa m3 = new Mahasiswa("22003", "Citra", "SIB");

        Mahasiswa[] mhs = {m1, m2, m3};

        // === OBJECT BUKU ===
        Buku b1 = new Buku("B001", "Algoritma", 2020);
        Buku b2 = new Buku("B002", "Basis Data", 2019);
        Buku b3 = new Buku("B003", "Pemrograman", 2021);
        Buku b4 = new Buku("B004", "Fisika", 2024);

        Buku[] buku = {b1, b2, b3, b4};

        // === OBJECT PEMINJAMAN ===
        Peminjaman p1 = new Peminjaman(m1, b1, 7);
        Peminjaman p2 = new Peminjaman(m2, b2, 3);
        Peminjaman p3 = new Peminjaman(m3, b3, 10);
        Peminjaman p4 = new Peminjaman(m3, b4, 6);
        Peminjaman p5 = new Peminjaman(m1, b2, 4);

        Peminjaman[] pinjam = {p1, p2, p3, p4, p5};

        // === TAMPIL DATA ===
        System.out.println("=== MAHASISWA ===");
        for (Mahasiswa m : mhs) {
            m.tampil();
        }

        System.out.println("\n=== BUKU ===");
        for (Buku b : buku) {
            b.tampil();
        }

        System.out.println("\n=== PEMINJAMAN ===");
        for (Peminjaman p : pinjam) {
            p.tampil();
        }
    }
}