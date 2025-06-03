package utilPassword;

public class PasworUtil {
    enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }
    public static SecurityLevel assessPassword(String password){

        if (password.length()<8) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z0-9]+")) {
            return SecurityLevel.MEDIUM;
        }

        if (password.matches("[a-zA-Z]+")) {
            return SecurityLevel.WEAK;
        }
        return SecurityLevel.STRONG;
    }
}

