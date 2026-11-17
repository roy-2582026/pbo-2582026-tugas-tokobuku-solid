public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasi;
    private int diskon;

    public BukuAudio(String judul, String penulis,
                     int harga, int durasi, int diskon) {
        super(judul, penulis, harga);
        this.durasi = durasi;
        this.diskon = diskon;
    }

    @Override
    public String getInfoUnduhan() {
        return durasi + " menit";
    }

    @Override
    public String getKeterangan() {
        return durasi + " menit, diskon " + diskon + "%";
    }

    @Override
    public int getHargaAkhir() {
        return harga * (100 - diskon) / 100;
    }
}