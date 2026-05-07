
class contoh1 {

    public static void main(String[] args) {
        try {
            int hasil = 10 / 2;
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Ups! Terjadi Error: Tidak bisa membagi angka dengan nol! ");
        } finally {
            System.out.println("Blok finally dijalankan -> membersihkan resource.");
        }
    }
}
