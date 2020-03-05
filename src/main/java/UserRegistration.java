import java.util.regex.Pattern;

public class UserRegistration
{
    String pattern = "^[A-Z][a-zA-Z]{2,}$";
    public static void main(String[] args) {
        System.out.println("Welcome to user registration");

    }

    public boolean FirstName(String firstName)
    {
        return Pattern.matches(pattern, firstName);
    }
}
