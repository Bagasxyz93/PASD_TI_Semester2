import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RoyalDelishService resto =
                new RoyalDelishService();

        int pilihan;

        do {

            System.out.println("\n==============================");
            System.out.println("      ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Layani Pembeli");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");

            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    resto.tambahAntrian(sc);
                    break;

                case 2:
                    resto.cetakAntrian();
                    break;

                case 3:
                    resto.layaniPembeli(sc);
                    break;

                case 4:
                    resto.laporanPesanan();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilihan != 5);

        sc.close();
    }
}