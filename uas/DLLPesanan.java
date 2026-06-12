public class DLLPesanan {

    NodePesanan head;
    NodePesanan tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(Pesanan pesanan) {

        NodePesanan baru = new NodePesanan(pesanan);

        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    public void sortNamaPesanan() {

        if (isEmpty()) {
            return;
        }

        for (NodePesanan i = head; i != null; i = i.next) {

            for (NodePesanan j = i.next; j != null; j = j.next) {

                if (i.data.namaPesanan.compareToIgnoreCase(
                        j.data.namaPesanan) > 0) {

                    Pesanan temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    public void tampilPesanan() {

    if (isEmpty()) {
        System.out.println("Belum ada pesanan");
        return;
    }

    sortNamaPesanan();

    int totalPendapatan = 0;

    System.out.println("\n========================================================================");
    System.out.printf("%-10s %-35s %-15s%n",
            "Kode",
            "Nama Pesanan",
            "Harga");
    System.out.println("========================================================================");

    NodePesanan temp = head;

    while (temp != null) {

        System.out.printf("%-10d %-35s Rp %,d%n",
                temp.data.kodePesanan,
                temp.data.namaPesanan,
                temp.data.harga);

        totalPendapatan += temp.data.harga;

        temp = temp.next;
    }

    System.out.println("========================================================================");
    System.out.printf("%-46s Rp %,d%n",
            "Total Pendapatan :",
            totalPendapatan);
    System.out.println("========================================================================");
}
}