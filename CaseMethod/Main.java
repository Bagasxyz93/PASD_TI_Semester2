import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // DATA MAHASISWA
        Mahasiswa[] mhs = {
            new Mahasiswa("22001", "Andi", "TI"),
            new Mahasiswa("22002", "Budi", "TI"),
            new Mahasiswa("22003", "Citra", "SIB")
        };

        // DATA BUKU
        Buku[] buku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        // DATA PEMINJAMAN
        Peminjaman[] pinjam = {
            new Peminjaman(mhs[0], buku[0], 7, 3),
            new Peminjaman(mhs[1], buku[1], 3,1),
            new Peminjaman(mhs[2], buku[2], 10, 3),
            new Peminjaman(mhs[2], buku[3], 6, 3),
            new Peminjaman(mhs[0], buku[1], 4, 2)
        };

        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Data Mahasiswa & Buku");
            System.out.println("2. Tampilkan Data Peminjaman");
            System.out.println("3. Hitung Denda");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {

                case 1:
                    System.out.println("\n=== DATA MAHASISWA ===");
                    Mahasiswa.header();
                    for (Mahasiswa m : mhs) m.tampil();

                    System.out.println("\n=== DATA BUKU ===");
                    Buku.header();
                    for (Buku b : buku) b.tampil();
                    break;

                case 2:
                    System.out.println("\n=== DATA PEMINJAMAN ===");
                    Peminjaman.header();
                    for (Peminjaman p : pinjam) p.tampil();
                    break;

                case 3:
                    System.out.println("\n=== DENDA PEMINJAMAN ===");
                    System.out.printf("%-15s %-10s\n", "Nama", "Denda");
                    System.out.println("---------------------------");
                    for (Peminjaman p : pinjam) {
                        System.out.printf("%-15s %-10d\n",
                                p.mhs.nama, p.hitungDenda());
                    }
                    break;

                case 4:
                    // INSERTION SORT (descending)
                    for (int i = 1; i < pinjam.length; i++) {
                        Peminjaman temp = pinjam[i];
                        int j = i - 1;

                        while (j >= 0 && pinjam[j].denda < temp.denda) {
                            pinjam[j + 1] = pinjam[j];
                            j--;
                        }
                        pinjam[j + 1] = temp;
                    }

                    System.out.println("\n=== SORTING DENDA TERBESAR ===");
                    Peminjaman.header();
                    for (Peminjaman p : pinjam) p.tampil();
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();

                    boolean ketemu = false;

                    System.out.println("\n=== HASIL PENCARIAN ===");
                    Peminjaman.header();

                    for (Peminjaman p : pinjam) {
                        if (p.mhs.nim.equals(cari)) {
                            p.tampil();
                            ketemu = true;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
        sc.close();
    }
}