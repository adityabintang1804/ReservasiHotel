import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
public class Nota {
    private Tamu tamu;
    private Kamar kamar;
    private LocalDate tanggalCheckIn;
    private LocalDate tanggalCheckOut;
    private double totalBiaya;

    public Nota(Tamu tamu, Kamar kamar, LocalDate tanggalCheckIn, LocalDate tanggalCheckOut) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.tanggalCheckIn = tanggalCheckIn;
        this.tanggalCheckOut = tanggalCheckOut;
        this.hitungTotalBiaya();
    }

    private void hitungTotalBiaya() {
        long lamaMenginap = ChronoUnit.DAYS.between(tanggalCheckIn, tanggalCheckOut);
        this.totalBiaya = kamar.hitungBiayaKamar((int)lamaMenginap);
    }

    public void cetakInformasi() {
        System.out.println("\n--- Informasi Reservasi ---");
        System.out.println("Nama Tamu: " + tamu.getNama());
        System.out.println("Nomor Telepon: " + tamu.getNomorTelepon());
        System.out.println("Tipe Kamar: " + kamar.getTipeKamar());
        System.out.println("Nomor Kamar: " + kamar.getNomorKamar());
        System.out.println("Tanggal Check-In: " + tanggalCheckIn);
        System.out.println("Tanggal Check-Out: " + tanggalCheckOut);
        System.out.println("Total Biaya: Rp " + String.format("%,.2f", totalBiaya));
    }

    public Kamar getKamar() {
        return kamar;
    }
}
