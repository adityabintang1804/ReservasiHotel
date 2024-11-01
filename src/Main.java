import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
public class Main {

    private static ArrayList<Kamar> daftarKamar = new ArrayList<>();
    private static ArrayList<Nota> daftarTransaksi = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        daftarKamar.add(new KamarStandar("101", 500000, true));
        daftarKamar.add(new KamarStandar("102", 450000, false));
        daftarKamar.add(new KamarVip("201", 1000000, 2));
        daftarKamar.add(new KamarVip("202", 1200000, 3));

        while (true) {
            cetakMenu();
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    lakukanReservasi();
                    break;
                case 2:
                    lihatDaftarKamar();
                    break;
                case 3:
                    lihatRiwayatReservasi();
                    break;
                case 4:
                    System.out.println("Terima kasih. Sampai jumpa!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void cetakMenu() {
        System.out.println("\n=== Sistem Manajemen Hotel ===");
        System.out.println("1. Lakukan Reservasi");
        System.out.println("2. Lihat Daftar Kamar");
        System.out.println("3. Lihat Riwayat Reservasi");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan anda: ");
    }

    private static void lakukanReservasi() {
        System.out.print("Masukkan nama tamu: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan nomor telepon: ");
        String nomorTelepon = scanner.nextLine();
        Tamu tamu = new Tamu(nama, nomorTelepon);

        System.out.println("\nDaftar Kamar Tersedia:");
        for (int i = 0; i < daftarKamar.size(); i++) {
            Kamar kamar = daftarKamar.get(i);
            System.out.println((i+1) + ". Kamar " + kamar.getTipeKamar() +
                    " - No. " + kamar.getNomorKamar() +
                    " (Rp " + String.format("%,.2f", kamar.getHargaKamar()) + ")");
        }

        System.out.print("Pilih nomor kamar: ");
        int pilihanKamar = scanner.nextInt() - 1;
        Kamar kamarTerpilih = daftarKamar.get(pilihanKamar);

        scanner.nextLine();
        System.out.print("Masukkan tanggal Check-In (yyyy-mm-dd): ");
        LocalDate tanggalCheckIn = LocalDate.parse(scanner.nextLine());
        System.out.print("Masukkan tanggal Check-Out (yyyy-mm-dd): ");
        LocalDate tanggalCheckOut = LocalDate.parse(scanner.nextLine());

        Nota nota = new Nota(tamu, kamarTerpilih, tanggalCheckIn, tanggalCheckOut);
        daftarTransaksi.add(nota);

        nota.cetakInformasi();
    }

    private static void lihatDaftarKamar() {
        System.out.println("\n=== Daftar Kamar ===");
        for (Kamar kamar : daftarKamar) {
            System.out.println("Kamar " + kamar.getTipeKamar() +
                    " - No. " + kamar.getNomorKamar() +
                    " (Rp " + String.format("%,.2f", kamar.getHargaKamar()) + ")");
        }
    }

    private static void lihatRiwayatReservasi() {
        if (daftarTransaksi.isEmpty()) {
            System.out.println("\nBelum ada reservasi.");
            return;
        }

        System.out.println("\n=== Riwayat Reservasi ===");
        for (Nota nota : daftarTransaksi) {
            nota.cetakInformasi();
        }
    }
}