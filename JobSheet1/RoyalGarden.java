public class RoyalGarden {

    static int[][] stok = {
        {10,5,15,7},
        {6,11,9,12},
        {2,10,10,5},
        {5,7,12,9}
    };

    static int[] harga = {75000,50000,60000,10000};

    public static void main(String[] args) {

        for (int i = 0; i < stok.length; i++) {

            int pendapatan = hitung(i);

            System.out.println("Cabang " + (i+1));
            System.out.println("Pendapatan: Rp " + pendapatan);

            if (pendapatan > 1500000) {
                System.out.println("Status: Sangat Baik");
            } else {
                System.out.println("Status: Perlu Evaluasi");
            }

            System.out.println();
        }
    }

    static int hitung(int cabang) {

        int total = 0;

        for (int i = 0; i < 4; i++) {
            total += stok[cabang][i] * harga[i];
        }

        return total;
    }
}
