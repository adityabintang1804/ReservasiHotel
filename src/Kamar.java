abstract class Kamar {
    private String nomorKamar;
    private String tipeKamar;
    private double hargaKamar;
    private boolean tersedia;

    public Kamar() {
        this.tersedia = true;
    }

    public Kamar(String nomorKamar, String tipeKamar, double hargaKamar) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.hargaKamar = hargaKamar;
        this.tersedia = true;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }
    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }
    public String getTipeKamar() {
        return tipeKamar;
    }
    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }
    public double getHargaKamar() {
        return hargaKamar;
    }
    public void setHargaKamar(double hargaKamar) {
        this.hargaKamar = hargaKamar;
    }
    public boolean isTersedia() {
        return tersedia;
    }
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public abstract double hitungBiayaKamar(int lamaMenginap);
}