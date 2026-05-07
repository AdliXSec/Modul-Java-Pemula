
public class throw2 {

    double saldo;

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah setor harus lebih dari 0");
        }
        saldo += jumlah;
    }

    public static void main(String[] args) {
        throw2 rekening = new throw2();
        try {
            rekening.setor(0);
            System.out.println("Setor Rp0 berhasil.");
            System.out.println("Saldo: Rp" + rekening.saldo);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program selesai dieksekusi dengan aman.");
        }

    }
}
