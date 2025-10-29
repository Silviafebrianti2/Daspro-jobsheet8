import java.util.Scanner;

public class JumlahKuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        // Outer loop untuk setiap nilai dari 1 hingga n
        for (int i = 1; i <= n; i++) {
            int jumlahKuadrat = 0;
            System.out.print("n = " + i + " → jumlah kuadrat = ");

            // Inner loop untuk menghitung kuadrat dari 1 sampai i
            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                jumlahKuadrat += kuadrat;

                // Menampilkan setiap kuadrat dengan format
                System.out.print(kuadrat);
                if (j < i) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + jumlahKuadrat); // Menampilkan hasil jumlah
        }
        sc.close();
    }
}
