public class BukuDigital extends Buku implements BisaDiunduh {
    private String ukuran;
    private int diskon;

    public BukuDigital(String judul, String penulis,
                       int harga, String ukuran, int diskon) {
        super(judul, penulis, harga);
        this.ukuran = ukuran;
        this.diskon = diskon;
    }

    @Override
    public String getInfoUnduhan() {
        return ukuran;
    }

    @Override
    public String getKeterangan() {
        return ukuran + ", diskon " + diskon + "%";
    }

    @Override
    public int getHargaAkhir() {
        return harga * (100 - diskon) / 100;
    }
}