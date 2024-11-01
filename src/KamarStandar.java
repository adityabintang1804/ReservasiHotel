public class KamarStandar extends Kamar{
    private boolean fasilitasTambahan;

    public KamarStandar(String nomorKamar, double hargaKamar, boolean fasilitasTambahan) {
        super(nomorKamar, "Standar", hargaKamar);
        this.fasilitasTambahan = fasilitasTambahan;
    }

    @Override
    public double hitungBiayaKamar(int lamaMenginap) {
        double biayaTambahan = fasilitasTambahan ? 100000 : 0;
        return (getHargaKamar() * lamaMenginap) + biayaTambahan;
    }

    public boolean isFasilitasTambahan() {
        return fasilitasTambahan;
    }
    public void setFasilitasTambahan(boolean fasilitasTambahan) {
        this.fasilitasTambahan = fasilitasTambahan;
    }
}
