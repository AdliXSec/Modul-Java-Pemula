
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContohThrows {

    public static void bacaDokumen(String namaFile) throws FileNotFoundException {
        System.out.println("Mencari file: " + namaFile);

        File file = new File(namaFile);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println("File berhasil dibaca.");
    }

    public static void main(String[] args) {
        System.out.println("--- Menguji THROWS (Baca File) ---");

        try {
            bacaDokumen("text.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Error ditangkap: File tidak ditemukan di dalam sistem!");
        }

        System.out.println("Program selesai dieksekusi dengan aman.");
    }
}
