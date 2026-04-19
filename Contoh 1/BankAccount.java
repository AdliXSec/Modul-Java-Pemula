public class BankAccount {
// Data tersembunyi (hidden) dengan private

    private String nomorRekening;
    private String namaPemilik;
    private double saldo;
    private String pin; // sangat sensitif!
    private int jumlahGagal; // internal tracking
    // Constructor
    public BankAccount(String noRek, String nama, double saldoAwal, String pin)
    {
        this.nomorRekening = noRek;
        this.namaPemilik = nama;
        this.saldo = saldoAwal;
        this.pin = pin;
        this.jumlahGagal = 0;
    }

    // Getter — hanya baca, tidak bisa ubah sembarangan
    public String getNomorRekening() { return nomorRekening; }
    public String getNamaPemilik() { return namaPemilik; }
    public double getSaldo() { return saldo; }

    // TIDAK ada getPin() — pin tidak pernah dikembalikan!
    // Metode dengan validasi — satu-satunya cara mengubah saldo
    public boolean tarik(double jumlah, String pinInput) {
        if (!pinInput.equals(this.pin)) {
            jumlahGagal++;
            System.out.println("PIN salah! Percobaan ke-" + jumlahGagal);
            if (jumlahGagal >= 3) System.out.println("Kartu diblokir!");
            return false;
        }
        if (jumlah <= 0 || jumlah > saldo) {
            System.out.println("Jumlah penarikan tidak valid!");
            return false;
        }
        saldo -= jumlah;
        jumlahGagal = 0; // reset setelah berhasil
        System.out.printf("Penarikan Rp%.0f berhasil. Sisa: Rp%.0f%n", jumlah, saldo);
        return true;
    }
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.printf("Setor Rp%.0f berhasil. Saldo: Rp%.0f%n", jumlah,
            saldo);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0!");
        }
    }
}

