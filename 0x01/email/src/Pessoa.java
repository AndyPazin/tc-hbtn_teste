public class Pessoa {

    public static boolean emailValid(String email) {
        if (email == null || email.isEmpty() || !email.contains("@") || email.length() > 50) {
            return false;
        }
        return true;
    }
}