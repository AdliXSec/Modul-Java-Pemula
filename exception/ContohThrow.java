
public class ContohThrow {

    public static void validasiUmur(int umur) {
        System.out.println("Mengecek umur: " + umur);

        if (umur < 18) {
            throw new IllegalArgumentException("Pendaftaran gagal: Umur minimal harus 18 tahun.");
        }

        System.out.println("Validasi berhasil. Umur Anda mencukupi.");
    }

    public static void main(String[] args) {
        System.out.println("--- Menguji THROW (Validasi Umur) ---");

        try {
            validasiUmur(19);
        } catch (IllegalArgumentException e) {
            System.out.println("Error ditangkap: " + e.getMessage());
        }

        System.out.println("Program selesai dieksekusi dengan aman.");
    }
}
