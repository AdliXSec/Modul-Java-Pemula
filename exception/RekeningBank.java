
public class RekeningBank {

    private String pemilik;
    private double saldo;

    public RekeningBank(String pemilik, double saldoAwal) {
        if (saldoAwal < 0) {
            throw new IllegalArgumentException("Saldo awal tidak boleh negatif");
        }
        this.pemilik = pemilik;
        this.saldo = saldoAwal;
    }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah setor harus lebih dari 0");
        }
        saldo += jumlah;
        System.out.println("Setor Rp" + jumlah + " berhasil. Saldo: Rp" + saldo);
    }

    public void tarik(double jumlah) throws SaldoTidakCukupException {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah tarik harus lebih dari 0");
        }
        if (jumlah > saldo) {
            throw new SaldoTidakCukupException(saldo, jumlah);
        }
        saldo -= jumlah;
        System.out.println("Tarik Rp" + jumlah + " berhasil. Saldo: Rp" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getPemilik() {
        return pemilik;
    }
}
