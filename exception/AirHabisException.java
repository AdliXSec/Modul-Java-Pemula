
public class AirHabisException extends Exception {

    private int sisaAir;

    public AirHabisException(String pesan, int sisaAir) {
        super(pesan);
        this.sisaAir = sisaAir;
    }

    public int getSisaAir() {
        return sisaAir;
    }
}
