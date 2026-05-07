
public class Login {

    public String username;
    public String password;

    public Login(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public void ProsesLogin(String username, String password) throws GagalLoginException {
        if (username.equals("admin") && password.equals("123")) {
            System.out.println("Login berhasil!");
        } else {
            throw new GagalLoginException("Username atau password salah!");
        }
    }
}
