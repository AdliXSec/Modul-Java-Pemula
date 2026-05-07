
public class MesinKopi {

    private int kapasitasAir;

    public MesinKopi(int isiAirAwal) {
        this.kapasitasAir = isiAirAwal;
    }

    public void seduhKopi(String jenisKopi, int kebutuhanAir) throws AirHabisException {
        System.out.println("Menerima pesanan: " + jenisKopi);
        System.out.println("Mengecek ketersediaan air...");

        if (kapasitasAir < kebutuhanAir) {
            throw new AirHabisException("Gagal menyeduh! Air di mesin tidak cukup.", kapasitasAir);
        }

        kapasitasAir -= kebutuhanAir;
        System.out.println("Berhasil menyeduh " + jenisKopi + "!");
        System.out.println("Sisa air di mesin: " + kapasitasAir + " ml\n");
    }
}
