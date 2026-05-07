
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class throws2 {

    public void bacafile(String namefile) throws FileNotFoundException {
        File file = new File(namefile);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println("File berhasil dibaca.");
    }

    public static void main(String[] args) {
        throws2 fileio = new throws2();
        try {
            String file = "file.txt";
            fileio.bacafile(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program selesai dieksekusi dengan aman.");
        }
    }
}
