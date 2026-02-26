
public class MahasiswaMain18 {
    public static void main(String[] args) {
        Mahasiswa18 mhs1 = new Mahasiswa18();
        Mahasiswa18 mhs2 = new Mahasiswa18("Bob", "87654321", "TI-1B", 3.5);
        mhs1.nama = "Alice" ;
        mhs1.nim = "12345678";
        mhs1.kelas = "TI-1A";
        mhs1.ipk = 3.8;

        System.out.println("Informasi Mahasiswa:");
        mhs1.tampilkanInfo();
        mhs1.ubahKelas("TI-1B");
        mhs1.updateIPK(3.9);
        System.out.println("\nSetelah update:");
        mhs1.tampilkanInfo();

        System.out.println("\nInformasi Mahasiswa 2:");
        mhs2.tampilkanInfo();
        mhs2.updateIPK(3.6);
        System.out.println("\nSetelah update IPK Mahasiswa 2:");
        mhs2.tampilkanInfo();
    }
}
