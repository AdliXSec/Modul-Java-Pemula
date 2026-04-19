
class Makhluk {

    public Makhluk() {
        System.out.println("Makhluk di ciptakan");
    }

    public void bernafas() {
        System.out.println("bernafas");
    }

    public void bergerak() {
        System.out.println("bergerak");
    }
}

class Hewan extends Makhluk {

    protected String namaHewan;
    protected String suara;

    public Hewan(String namaHewan) {
        super();
        this.namaHewan = namaHewan;
        System.out.println("Hewan " + this.namaHewan + " di ciptakan");
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }
}

class Mamalia extends Hewan {

    protected boolean berambut;

    public Mamalia(String namaHewan, String suara) {
        super(namaHewan);
        this.setSuara(suara);
        this.berambut = true;
        System.out.println("Mamalia " + this.namaHewan + " di ciptakan dengan berambut");
    }
}

class Kucing extends Mamalia {

    private String warna;

    public Kucing(String nama, String warna, String suara) {
        super(nama, suara);
        this.warna = warna;
        System.out.println("Kucing " + this.namaHewan + " di ciptakan dengan rambut berwarna warna " + this.warna + " dan bersuara " + this.suara);
    }
}
