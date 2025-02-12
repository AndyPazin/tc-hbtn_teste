
public class Person {

    public boolean checkUser(String user) {
        if (user == null || user.length() < 8 || !user.matches("[a-zA-Z0-9]*")) {
            return false;
        }
        return true;
    }

    public boolean checkPassword(String password) {
        if (password == null || password.length() < 8 ||
                !password.matches(".*[A-Z].*") ||
                !password.matches(".*[0-9].*") ||
                !password.matches(".*[^a-zA-Z0-9].*")) {
            return false;
        }
        return true;
    }
}