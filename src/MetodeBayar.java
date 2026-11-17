public interface MetodeBayar {
    String nama();

    // Kontrak: hasil totalBayar tidak pernah negatif.
    int totalBayar(int totalBelanja);
}