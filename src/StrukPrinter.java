public class StrukPrinter {

    public void cetakKeranjang(String judul, Keranjang keranjang) {
        System.out.println("============ " + judul + " ============");

        for (Buku buku : keranjang.getIsi()) {
            System.out.println(buku.getJudul() +
                    " (" + buku.getPenulis() + ")");

            System.out.println("  Harga: " +
                    Buku.formatRupiah(buku.getHarga()));

            System.out.println("  Keterangan: " +
                    buku.getKeterangan());

            System.out.println("  Harga akhir: " +
                    Buku.formatRupiah(buku.getHargaAkhir()));
        }

        System.out.println("----------------------------------------");
        System.out.println("Total belanja: " +
                Buku.formatRupiah(keranjang.hitungTotal()));
    }

    public void cetakPembayaran(int totalBelanja,
                                MetodeBayar[] pilihan) {
        System.out.println("------------- PEMBAYARAN -------------");

        for (MetodeBayar metode : pilihan) {
            System.out.printf("%-20s : %s%n",
                    metode.nama(),
                    Buku.formatRupiah(metode.totalBayar(totalBelanja)));
        }
    }
}