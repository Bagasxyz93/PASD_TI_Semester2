public class MataKuliah18 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah18() {

    }

    public MataKuliah18(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        if (sksBaru > 0) {
            sks = sksBaru;
            System.out.println("SKS berhasil diubah menjadi: " + sks);
        } else {
            System.out.println("SKS tidak valid. Harus lebih dari 0.");
        }
    }

    void tambahJam(int jamTambahan) {
        if (jamTambahan > 0) {
            jumlahJam += jamTambahan;
            System.out.println("Jumlah Jam berhasil ditambahkan. Total Jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Jam tambahan tidak valid. Harus lebih dari 0.");
        }
    }

    void kurangiJam(int jamPengurangan) {
        if (jamPengurangan > 0 && jamPengurangan <= jumlahJam) {
            jumlahJam -= jamPengurangan;
            System.out.println("Jumlah Jam berhasil dikurangi. Total Jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Jam pengurangan tidak valid. Harus lebih dari 0 dan tidak melebihi jumlah jam saat ini.");
        }
    }
}
