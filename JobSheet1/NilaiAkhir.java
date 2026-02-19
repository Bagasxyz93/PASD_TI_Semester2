
import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nilai Tugas: ");
        double tugas = sc.nextDouble();

        System.out.print("Nilai Kuis: ");
        double kuis = sc.nextDouble();

        System.out.print("Nilai UTS: ");
        double uts = sc.nextDouble();

        System.out.print("Nilai UAS: ");
        double uas = sc.nextDouble();

        sc.close();

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("Nilai tidak valid");
        } else {

            double nilaiAkhir =
                    (0.2 * tugas) +
                    (0.2 * kuis) +
                    (0.3 * uts) +
                    (0.3 * uas);

            String huruf, status;

            if (nilaiAkhir >= 85) huruf = "A";
            else if (nilaiAkhir >= 80) huruf = "B+";
            else if (nilaiAkhir >= 70) huruf = "B";
            else if (nilaiAkhir >= 65) huruf = "C+";
            else if (nilaiAkhir >= 60) huruf = "C";
            else if (nilaiAkhir >= 50) huruf = "D";
            else huruf = "E";

            if (huruf.equals("D") || huruf.equals("E"))
                status = "TIDAK LULUS";
            else
                status = "LULUS";

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("Status      : " + status);
        }
    }
}