package Model;

public class Voucher extends Barang {
    private int nominal;
    private double ppn;

    public Voucher(String id, String nama, int harga, int stok, int nominal, double ppn) {
        super(id, nama, harga, stok);
        this.nominal = nominal;
        this.ppn = ppn;
    }

    public int getNominal() { return nominal; }
    public double getPpn() { return ppn; }
}
