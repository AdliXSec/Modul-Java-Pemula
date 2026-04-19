public class Kampus {
    public String kegiatan;
    public String namaKampus = "Telkom SBY";

    public Kampus(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public void happy() {
        System.out.println("Saya "+kegiatan+" di "+namaKampus);
    }
}