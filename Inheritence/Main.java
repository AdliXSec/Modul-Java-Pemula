public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil("Toyota", 2022, 4);

        m.akselerasi(60); // diwarisi dari Kendaraan
        m.bunyikanKlakson(); // milik Mobil sendiri
        m.info();

        System.out.println();

        Motor mo = new Motor("Honda", 2023, false);
        
        mo.akselerasi(80);
        mo.wheelie();
        mo.info();
    }
}