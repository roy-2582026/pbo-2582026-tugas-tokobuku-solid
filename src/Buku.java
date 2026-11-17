public abstract class Buku {
    protected String judul;
    protected String penulis;
    protected int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    public abstract String getKeterangan();

    public abstract int getHargaAkhir();

    protected static String formatRupiah(int nilai) {
        return "Rp" + String.format("%,d", nilai).replace(',', '.');
    }
}