public class Kendaraan {
    protected String merk;
    protected int tahun;
    protected double kecepatan;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
        this.kecepatan = 0;
    }

    public void akselerasi(double kecepatan) {
        this.kecepatan += kecepatan;
        System.out.printf("%s berakselerasi: %.0f km/h%n", merk, this.kecepatan);
    }

    public void info() {
        System.out.println("Merk: " + merk + " | Tahun: " + tahun);
    }
}
