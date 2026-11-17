// Memberikan diskon sebesar 2% untuk pembayaran E-Wallet.
public class EWallet implements MetodeBayar {

    @Override
    public String nama() {
        return "E-Wallet (diskon 2%)";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return Math.max(0, totalBelanja) * 98 / 100;
    }
}