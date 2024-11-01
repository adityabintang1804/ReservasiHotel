public class Resepsionis {
    private String namaResepsionis;
    private String idResepsionis;

    public Resepsionis(String namaResepsionis, String idResepsionis) {
        this.namaResepsionis = namaResepsionis;
        this.idResepsionis = idResepsionis;
    }

    public void prosesReservasi(Tamu tamu, Kamar kamar, String tanggalCheckIn, String tanggalCheckOut) {
        System.out.println("Reservasi untuk " + tamu.getNama() + " di kamar " + kamar.getNomorKamar() + " sedang diproses.");
    }

    public String getNamaResepsionis() {
        return namaResepsionis;
    }

    public void setNamaResepsionis(String namaResepsionis) {
        this.namaResepsionis = namaResepsionis;
    }

    public String getIdResepsionis() {
        return idResepsionis;
    }

    public void setIdResepsionis(String idResepsionis) {
        this.idResepsionis = idResepsionis;
    }
}
