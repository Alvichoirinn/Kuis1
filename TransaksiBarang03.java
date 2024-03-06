/**
 * TransaksiBarang03
 */
public class TransaksiBarang03 {
    private Barang03[] barang;
    private Barang03[] pembelian;

    public TransaksiBarang03(Barang03[] barang) {
        this.barang = barang;
        this.pembelian = new Barang03[barang.length];
    }

    public void tampilkanBarang() {
        System.out.println("Daftar Barang:");
        for (Barang03 barang : barang) {
            System.out.println("Kode: " + barang.getKode() + ", Nama: " + barang.getNama() + ", Harga: " + barang.getHarga() + ", Stok: " + barang.getStok());
        }
    }

    public void tampilkanBarangPembelian() {
        System.out.println("Barang yang Dibeli:");
        for (Barang03 barang : pembelian) {
            if (barang != null) {
                System.out.println("Kode: " + barang.getKode() + ", Nama: " + barang.getNama() + ", Harga: " + barang.getHarga());
            }
        }
    }
}
