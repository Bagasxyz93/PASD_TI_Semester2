import java.util.Scanner;

public class Tugas1PlatKota {
    public static void main(String[] args) {

        char[] kode = {'A','B','D','E','F','H','L','N','T','Z'};

        String[][] kota = {
            {"Banten"},
            {"Jakarta"},
            {"Bandung"},
            {"Cirebon"},
            {"Bogor"},
            {"Semarang"},
            {"Surabaya"},
            {"Malang"},
            {"Tegal"},
            {"Tasikmalaya"}
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Kode Plat: ");
        char input = sc.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        for (int i = 0; i < kode.length; i++) {

            if (input == kode[i]) {
                System.out.println("Kota: " + kota[i][0]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode tidak ditemukan");
        }

        sc.close();
    }
}
