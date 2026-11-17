public class BukuCetak extends Buku {
    private int berat;
    private int ongkir;

    public BukuCetak(String judul, String penulis,
                     int harga, int berat, int ongkir) {
        super(judul, penulis, harga);
        this.berat = berat;
        this.ongkir = ongkir;
    }

    @Override
    public String getKeterangan() {
        return berat + " gram, ongkir " + formatRupiah(ongkir);
    }

    @Override
    public int getHargaAkhir() {
        return harga + ongkir;
    }
}