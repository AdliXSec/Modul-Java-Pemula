
public class Main {

    public static void main(String[] args) {
        Tracking tracking = new Tracking();
        tracking.lacak("Jakarta", "Bandung");
        tracking.lacak("Jakarta", "Bandung", "Surabaya");
        tracking.lacak("Jakarta", "Bandung", "Surabaya", "Semarang");
        tracking.lacak("Jakarta");
    }
}
