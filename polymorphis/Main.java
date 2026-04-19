
public class Main {

    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        System.out.println(k.tambah(5, 3)); // Overload 1
        System.out.println(k.tambah(1, 2, 3)); // Overload 2
        System.out.println(k.tambah(2.5, 1.5)); // Overload 3
        System.out.println(k.tambah("Halo", "Dunia")); // Overload 4
    }
}
