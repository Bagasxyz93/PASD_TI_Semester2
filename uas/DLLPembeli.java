public class DLLPembeli {

    NodePembeli head;
    NodePembeli tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli pembeli) {

        NodePembeli baru = new NodePembeli(pembeli);

        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    public Pembeli hapusDepan() {

        if (isEmpty()) {
            return null;
        }

        Pembeli dataKeluar = head.data;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return dataKeluar;
    }

   public void cetakAntrian() {

    if (isEmpty()) {
        System.out.println("Antrian kosong");
        return;
    }

    System.out.println("\n============================================================");
    System.out.printf("%-10s %-25s %-20s%n",
            "No",
            "Nama Pembeli",
            "No HP");
    System.out.println("============================================================");

    NodePembeli temp = head;

    while (temp != null) {

        System.out.printf("%-10d %-25s %-20s%n",
                temp.data.noAntrian,
                temp.data.namaPembeli,
                temp.data.noHp);

        temp = temp.next;
    }

    System.out.println("============================================================");
}

    public int jumlahAntrian() {

        int jumlah = 0;

        NodePembeli temp = head;

        while (temp != null) {
            jumlah++;
            temp = temp.next;
        }

        return jumlah;
    }
}