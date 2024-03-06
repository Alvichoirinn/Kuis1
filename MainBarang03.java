import java.util.Scanner;
public class MainBarang03 {
        public static void main(String[] args) {
            //Inisisalisasi Barang03
            Barang03 barang1 = new Barang03("K01", "Sabun", 1000, 5);
            Barang03 barang2 = new Barang03("K02", "Pasta Gigi", 2000, 10);
            Barang03 barang3 = new Barang03("K03", "Biore", 3000, 23);
            Barang03 barang4 = new Barang03("K04", "Shampoo", 4000, 55);
            Barang03 barang5 = new Barang03("K05", "Sikat Gigi", 5000, 65);

            Barang03[] barang = {barang1, barang2, barang3, barang4, barang5};

            //Inisialisai transaksi barang
            TransaksiBarang03 transaksi = new TransaksiBarang03(barang);

            Scanner alvi = new Scanner(System.in);
            int pilihan;
            Barang03[] pembelian = null;

            System.out.println("==============================");
            System.out.println("TOKO MAJU MUNDUR CANTIK");
            System.out.println("==============================");
    
            do {
                System.out.println("\nMenu Transaksi Barang");
                System.out.println("1. Tampilkan Barang");
                System.out.println("2. Beli Barang");
                System.out.println("3. Tampilkan Barang yang Dibeli");
                System.out.println("4. Keluar");
                System.out.print("Masukkan pilihan (1-4): ");
                pilihan = alvi.nextInt();
                alvi.nextLine();

                System.out.println("=========================");
                System.out.println("DAFTAR BARANG");
                System.out.println("==========================");
    
                switch (pilihan) {
                    case 1:
                        transaksi.tampilkanBarang();
                        break;
                    case 2:
                        System.out.print("Masukkan kode barang yang ingin dibeli: ");
                        String kode = alvi.nextLine();
                        System.out.print("Nama barang: ");
                        String nama = alvi.nextLine();
                        System.out.print("Harga Barang: ");
                        double harga = alvi.nextDouble();
                        break;
                    case 3:
                        if (pembelian != null) {
                            transaksi.tampilkanBarangPembelian();
                        } else {
                            System.out.println("Belum ada barang yang dibeli.");
                        }
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan program Transaksi Barang!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 4);
    
            alvi.close();
        }
    }