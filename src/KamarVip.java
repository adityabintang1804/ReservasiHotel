public class KamarVip extends Kamar {
    private int jumlahRuangan;

    public KamarVip(String nomorKamar, double hargaKamar, int jumlahRuangan) {
        super(nomorKamar, "VIP", hargaKamar);
        this.jumlahRuangan = jumlahRuangan;
    }

    @Override
    public double hitungBiayaKamar(int lamaMenginap) {
        return getHargaKamar() * lamaMenginap * jumlahRuangan;
    }

    public int getJumlahRuangan() {
        return jumlahRuangan;
    }
    public void setJumlahRuangan(int jumlahRuangan) {
        this.jumlahRuangan = jumlahRuangan;
    }
}
