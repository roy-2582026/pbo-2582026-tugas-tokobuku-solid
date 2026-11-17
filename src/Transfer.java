// Menghitung total pembayaran dengan tambahan biaya transfer Rp2.500.
public class Transfer implements MetodeBayar {

    @Override
    public String nama() {
        return "Transfer (+Rp2.500)";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return Math.max(0, totalBelanja) + 2500;
    }
}