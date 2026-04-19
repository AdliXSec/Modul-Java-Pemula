public class Main {
    public static void main(String[] args) {
        
        Dosen dsn = new Dosen("Mengajar");

        Mahasiswa mhs = new Mahasiswa("Mengikuti kuliah");

        Staff stf = new Staff("Melakukan tugas");

        dsn.happy();
        mhs.happy();
        stf.happy();
    }
}
