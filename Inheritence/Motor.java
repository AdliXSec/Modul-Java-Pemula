public class Motor extends Kendaraan {
    private boolean adaSidecar;

    public Motor(String merk, int tahun, boolean adaSidecar) {
        super(merk, tahun);
        this.adaSidecar = adaSidecar;
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Sidecar: " + (adaSidecar ? "Ada" : "Tidak Ada"));
    }

    public void wheelie() {
        System.out.println(merk + " melakukan wheelie!");
    }
}
