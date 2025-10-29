import java.util.Scanner;

public class KopiSenja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCabang;
        int totalPelangganSemua = 0;
        int totalItemSemua = 0;

        System.out.print("Jumlah cabang kafe: ");
        jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        // Loop untuk setiap cabang
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            // Loop untuk pelanggan di cabang ini
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            // Tampilkan ringkasan untuk cabang ini
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan);
            System.out.println("- Item terjual: " + totalItemCabang);

            // Akumulasi total semua cabang
            totalPelangganSemua += jumlahPelanggan;
            totalItemSemua += totalItemCabang;
        }

        // Output total keseluruhan
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("- Pelanggan: " + totalPelangganSemua);
        System.out.println("- Item terjual: " + totalItemSemua);

        sc.close();
    }
}
