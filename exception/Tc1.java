
public class Tc1 {

    public static void main(String[] args) {
        System.out.println("--- Program Dimulai ---");

        int angka = 0;
        int pembagi = 0;
        // int hasil = 10 / pembagi;
        // System.out.println("Hasil: " + hasil);
        try {
            System.out.println("Mencoba menghitung 10 dibagi " + pembagi + "...");

            int hasil = 10 / pembagi;
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Ups! Terjadi Error: Tidak bisa membagi angka dengan nol! ");
        } finally {
            System.out.println("Blok finally dijalankan -> membersihkan resource. ");
        }
        while (angka < 10) {
            System.out.println("Perulangan ke-" + angka);
            angka++;
        }
        System.out.println("--- Program Selesai ---");
    }
}
