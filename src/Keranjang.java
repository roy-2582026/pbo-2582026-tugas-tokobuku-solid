import java.util.ArrayList;

public class Keranjang {
    private ArrayList<Buku> isi;

    public Keranjang() {
        isi = new ArrayList<>();
    }

    public void tambah(Buku buku) {
        isi.add(buku);
    }

    public ArrayList<Buku> getIsi() {
        return isi;
    }

    public int hitungTotal() {
        int total = 0;

        for (Buku buku : isi) {
            total += buku.getHargaAkhir();
        }

        return total;
    }
}