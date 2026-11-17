public class TokoBukuSolid {

    public static void main(String[] args) {

        // Membuat keranjang pertama
        Keranjang keranjang1 = new Keranjang();

        keranjang1.tambah(new BukuCetak(
                "Pemrograman Java", "John Doe",
                120000, 750, 10000));

        keranjang1.tambah(new BukuCetak(
                "Algoritma Dasar", "Jane Smith",
                95000, 400, 5000));

        keranjang1.tambah(new BukuDigital(
                "Belajar OOP", "Ani Wijaya",
                80000, "12,5 MB", 20));

        keranjang1.tambah(new BukuAudio(
                "Kisah Programmer", "Budi Santoso",
                60000, 240, 10));

        // Membuat keranjang kedua
        Keranjang keranjang2 = new Keranjang();

        keranjang2.tambah(new BukuDigital(
                "Belajar OOP", "Ani Wijaya",
                80000, "12,5 MB", 20));

        // Membuat pilihan pembayaran
        MetodeBayar[] pilihan = {
                new Tunai(),
                new Transfer(),
                new EWallet(),
                new Voucher(100000)
        };

        // Membuat printer struk
        StrukPrinter printer = new StrukPrinter();

        // Mencetak keranjang pertama
        printer.cetakKeranjang("KERANJANG PERTAMA", keranjang1);

        printer.cetakPembayaran(
                keranjang1.hitungTotal(), pilihan);

        System.out.println();

        // Mencetak keranjang kedua
        printer.cetakKeranjang("KERANJANG KEDUA", keranjang2);

        printer.cetakPembayaran(
                keranjang2.hitungTotal(), pilihan);
    }
}