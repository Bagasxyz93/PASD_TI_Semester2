public class MataKuliahMain18 {
    public static void main(String[] args) {
        MataKuliah18 mk1 = new MataKuliah18();
        mk1.kodeMK = "TI18";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        MataKuliah18 mk2 = new MataKuliah18(
            "OS12",
            "Sistem Operasi",
            4,
            8
        );

        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilkanInfo();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        System.out.println("\nSetelah update Mata Kuliah 1:");
        mk1.tampilkanInfo();

        System.out.println("\nInformasi Mata Kuliah 2:");
        mk2.tampilkanInfo();
    }
}
