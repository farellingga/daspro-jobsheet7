import java.util.Scanner;

public class SiakadWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, jml, i = 1;

        System.out.print("Masukkan jumlah nilai: ");
        jml = sc.nextInt();

        while (i <= jml) {
            System.out.print("Masukkan nilai ke-" + (1 + i) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, masukkan lagi (0-100)");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (1 + i) + " adalah E");
            }

            i++;
        }

        sc.close();
    }
}
