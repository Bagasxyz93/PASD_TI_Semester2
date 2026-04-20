public class mainQuiz{
    public static void main(String[] args) {
        quiz produk1 = new quiz("Laptop",5000000,10,20);
        quiz produk2 = new quiz("Smartphone",3000000,15,10);

        System.out.println("Informasi Produk:");
        produk1.tampilkanInfo();
        produk1.hitungHargaSetelahDiskon();
        System.err.println("===============================");
        produk2.tampilkanInfo();
        produk2.hitungHargaSetelahDiskon();
    }
}
