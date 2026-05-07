
public class Tc2 {

    public static void main(String[] args) {
        System.out.println("--- Mulai Akses Laci Penyimpanan ---");

        String[] laciBuku = {"Buku PBO", "Buku Basis Data", "Buku Jaringan"};

        try {
            System.out.println("Mengambil laci ke-0: " + laciBuku[0]);
            System.out.println("Mengambil laci ke-2: " + laciBuku[2]);

            // System.out.println("Mengambil laci ke-5: " + laciBuku[5]);
            System.out.println("Semua buku berhasil diambil.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ups! Error: Anda mencoba mengambil buku dari laci yang tidak ada!");

            System.out.println("Pesan sistem: Index " + e.getMessage() + " out of bounds");
        } finally {
            System.out.println("Blok finally: Selesai mengecek laci penyimpanan.");
        }

        System.out.println("--- Program Berjalan Normal Sampai Akhir ---");
    }
}
