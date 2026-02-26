public class DosenMain18 {
    public static void main(String[] args) {
        Dosen18 dosen1 = new Dosen18();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Smith";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Pemrograman";

        Dosen18 dosen2 = new Dosen18(
            "D002",
            "Dr. Johnson",
            false,
            2015,
            "Sistem Operasi"
        );

        System.out.println("Informasi Dosen 1:");
        dosen1.tampilkanInfo();
        System.out.println("Masa Kerja Dosen 1: " + dosen1.hitungMasaKerja(2025) + " tahun");

        System.out.println("\nInformasi Dosen 2:");
        dosen2.tampilkanInfo();
    }
}
