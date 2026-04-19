public class Kalkulator {
    // Overload 1: menjumlahkan dua int
    public int tambah(int a, int b) {
        System.out.println("[int+int] " + a + " + " + b);
        return a + b;
    }

    // Overload 2: menjumlahkan tiga int
    public int tambah(int a, int b, int c) {
        System.out.println("[int+int+int] " + a + "+" + b + "+" + c);
        return a + b + c;
    }

    // Overload 3: menjumlahkan dua double
    public double tambah(double a, double b) {
        System.out.printf("[double+double] %.1f + %.1f%n", a, b);
        return a + b;
    }

    // Overload 4: menggabungkan dua String
    public String tambah(String a, String b) {
        System.out.println("[String+String] " + a + " + " + b);
        return a + " " + b;
    }
}