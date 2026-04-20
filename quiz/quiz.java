public class quiz{
    String nama18;
    double harga18;
    int stok18;
    double diskon18;
    
    public quiz(String nama18, double harga18, int stok18, double diskon18) {
        this.nama18 = nama18;
        this.harga18 = harga18;
        this.stok18 = stok18;
        this.diskon18 = diskon18;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama18);
        System.out.println("Harga: " + harga18);
        System.out.println("Stok: " + stok18);
        System.out.println("Diskon: " + diskon18 + "%");
    }

    void hitungHargaSetelahDiskon() {
        double hargaSetelahDiskon = harga18 - (harga18 * diskon18 / 100);
        System.out.println("Harga setelah diskon: " + hargaSetelahDiskon);
    }
}