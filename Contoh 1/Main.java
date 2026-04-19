public class Main {
    public static void main(String[] args) {
        BankAccount rek = new BankAccount("1234-5678", "Budi", 1000000, "1234");

        // hacker
        rek.nomorRekening = "111111";
        
        System.out.println(rek.getNomorRekening());
        // System.out.println("Pemilik : " + rek.getNamaPemilik());
        // System.out.println("Saldo : Rp" + rek.getSaldo());
        // rek.tarik(200000, "9999"); // PIN salah
        // rek.tarik(200000, "1234"); // PIN benar
        // rek.setor(500000);
        // System.out.println("Saldo akhir: Rp" + rek.getSaldo());
    }
}
