import java.util.Scanner;

public class RoyalDelishService {

    DLLPembeli daftarAntrian;
    DLLPesanan daftarPesanan;

    private int nomorAntrian;

    public RoyalDelishService() {

        daftarAntrian = new DLLPembeli();
        daftarPesanan = new DLLPesanan();

        nomorAntrian = 1;
    }

    public void tambahAntrian(Scanner sc) {

        System.out.print("Nama Pembeli : ");
        String nama = sc.nextLine();

        System.out.print("No HP : ");
        String hp = sc.nextLine();

        Pembeli pembeli =
                new Pembeli(
                        nomorAntrian,
                        nama,
                        hp);

        daftarAntrian.tambahAntrian(pembeli);

        nomorAntrian++;

        System.out.println(
                "Pembeli masuk antrean No. "
                        + pembeli.noAntrian);
    }

    public void cetakAntrian() {

    daftarAntrian.cetakAntrian();

    System.out.println("Jumlah Antrean Saat Ini : "
            + daftarAntrian.jumlahAntrian());
}

    public void layaniPembeli(Scanner sc) {

        Pembeli pembeli =
                daftarAntrian.hapusDepan();

        if (pembeli == null) {

            System.out.println("Antrian kosong");
            return;
        }

        System.out.println(
                "\nMelayani : "
                        + pembeli.namaPembeli);

        System.out.print("Kode Pesanan : ");
        int kode = sc.nextInt();
        sc.nextLine();

        System.out.print("Nama Pesanan : ");
        String namaPesanan = sc.nextLine();

        System.out.print("Harga : ");
        int harga = sc.nextInt();
        sc.nextLine();

        Pesanan pesanan =
                new Pesanan(
                        kode,
                        namaPesanan,
                        harga);

        daftarPesanan.tambahPesanan(pesanan);

        System.out.println(
                "Pesanan berhasil disimpan");
    }

    public void laporanPesanan() {
        daftarPesanan.tampilPesanan();
    }
}