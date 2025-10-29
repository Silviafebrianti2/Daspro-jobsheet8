import java.util.Scanner;

public class NilaiKelompok26 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;        
        int j;           
        int nilai;       
        float totalNilai; 
        float rataNilai;  

        System.out.println("=== Program Perhitungan Nilai Kelompok ===");

       
        while (i <= 6) {
            System.out.println("\nKelompok " + i + ":");

            totalNilai = 0; 

            for (j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai dari Kelompok Penilai ke-" + j + ": ");
                nilai = sc.nextInt();

                while (nilai < 1 || nilai > 100) {
                    System.out.print("Nilai tidak valid! Masukkan nilai antara 1-100: ");
                    nilai = sc.nextInt();
                }

                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Total Nilai Kelompok " + i + " = " + totalNilai);
            System.out.println("Rata-rata Nilai Kelompok " + i + " = " + rataNilai);
            System.out.println("-------------------------------------------");

            i++;
        }

        System.out.println("=== Program Selesai ===");
        
        sc.close();
    }
}
