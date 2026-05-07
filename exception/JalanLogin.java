
public class JalanLogin {

    public static void main(String[] args) {
        Login login = new Login("admin", "1212312");
        try {
            login.ProsesLogin("admin", "1212312");
        } catch (GagalLoginException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
