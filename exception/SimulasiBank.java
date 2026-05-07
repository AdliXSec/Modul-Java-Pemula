
public class SimulasiBank {

    public static void main(String[] args) {

        System.out.println("===== SIMULASI REKENING BANK =====\n");

        // Buat rekening baru
        RekeningBank rek = new RekeningBank("Budi", 500000);

        rek.setor(200000);

        try {
            rek.tarik(300000);
            rek.tarik(999999);

        } catch (SaldoTidakCukupException e) {
            System.out.println("Gagal tarik: " + e.getMessage());
            System.out.println("Saldo kamu : Rp" + e.getSaldoSaatIni());
            System.out.println("Kamu minta : Rp" + e.getJumlahDiminta());

        } finally {
            System.out.println("\n[Transaksi selesai. Saldo akhir: Rp" + rek.getSaldo() + "]");
        }

        System.out.println("\n--- Uji Input Tidak Valid ---");
        try {
            rek.setor(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
