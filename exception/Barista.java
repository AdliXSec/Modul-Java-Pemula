
public class Barista {

    public static void main(String[] args) {
        System.out.println("=== KEDAI KOPI BUKA ===\n");

        MesinKopi mesin = new MesinKopi(500);

        try {
            mesin.seduhKopi("Americano", 250);

            mesin.seduhKopi("Kopi Susu", 150);

            mesin.seduhKopi("V60 Pour Over", 300);

            System.out.println("Semua pesanan selesai!");

        } catch (AirHabisException e) {
            System.out.println("🚨 ERROR MESIN KOPI: " + e.getMessage());
            System.out.println("💡 Info Sistem: Sisa air saat ini hanya " + e.getSisaAir() + " ml. Silakan isi ulang galon air!");
        }

        System.out.println("\n=== KEDAI KOPI TUTUP ===");
    }
}
