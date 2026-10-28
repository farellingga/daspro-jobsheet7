
import java.util.Scanner;

public class Tesk1JualanTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        int hargaTiket = 50000;
        double totalPenjualan = 0;
        double diskon, totalHarga;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

           
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid!");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            totalHarga = jumlahTiket * hargaTiket;
            totalHarga = totalHarga - (totalHarga * diskon);
            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Harga setelah diskon: Rp " + totalHarga);
        }
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        sc.close();
    }
}
