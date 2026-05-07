
public class SaldoTidakCukupException extends Exception {

    private double saldoSaatIni;
    private double jumlahDiminta;

    public SaldoTidakCukupException(double saldo, double diminta) {
        super("Saldo tidak cukup!");
        this.saldoSaatIni = saldo;
        this.jumlahDiminta = diminta;
    }

    public double getSaldoSaatIni() {
        return saldoSaatIni;
    }

    public double getJumlahDiminta() {
        return jumlahDiminta;
    }
}
