import java.util.Scanner;

public class Tugas2JadwalKuliah {

    static String[][] jadwal;
    static int n;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Jadwal: ");
        n = sc.nextInt();
        sc.nextLine();

        jadwal = new String[n][4];

        input(sc);
        tampil();

        System.out.print("\nCari Hari: ");
        String hari = sc.nextLine();
        cariHari(hari);

        System.out.print("\nCari Matkul: ");
        String mk = sc.nextLine();
        cariMK(mk);
    }

    static void input(Scanner sc) {

        for (int i = 0; i < n; i++) {

            System.out.println("\nData ke-" + (i+1));

            System.out.print("Matkul: ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari: ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam: ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampil() {

        System.out.println("\n=== Semua Jadwal ===");

        for (int i = 0; i < n; i++) {

            System.out.println(
                jadwal[i][0] + " | " +
                jadwal[i][1] + " | " +
                jadwal[i][2] + " | " +
                jadwal[i][3]
            );
        }
    }

    static void cariHari(String hari) {

        System.out.println("\n=== Jadwal Hari " + hari + " ===");

        for (int i = 0; i < n; i++) {

            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " " + jadwal[i][3]);
            }
        }
    }

    static void cariMK(String mk) {

        System.out.println("\n=== Jadwal " + mk + " ===");

        for (int i = 0; i < n; i++) {

            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println(jadwal[i][2] + " " + jadwal[i][3]);
            }
        }
    }
}
