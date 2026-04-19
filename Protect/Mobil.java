public class Mobil extends Kendaraan {
    private int kecepatanMaks;

    public Mobil(String merek, int kecepatanMaks) {
        this.merek = merek; // Mengakses atribut protected dari parent
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanDetail() {
        // Bisa mengakses 'merek' karena protected
        System.out.println("Mobil: " + merek + ", Kecepatan: " + kecepatanMaks + " km/jam");
    }
}
