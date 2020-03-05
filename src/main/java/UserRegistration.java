import java.util.regex.Pattern;
public class UserRegistration
{
    public static void main(String[] args) {
        System.out.println("Welcome to user registration");
    }
    public boolean FirstName(String firstName)
    {
        String pattern = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(pattern, firstName);
    }
    public boolean LastName(String lastName)
    {
        String pattern = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(pattern, lastName);
    }
    public boolean EmailId(String emailId)
    {
        String pattern = "^[a-z]{1,}([.+-_]?[a-z0-9]{1,})?[@][a-z0-9]{1,}[.]{1}[a-z]{2,}([.]?[a-z]{2,})?$";
        return Pattern.matches(pattern, emailId);
    }
    public boolean MobileNumber(String mobNumber)
    {
        String pattern  = "^[0-9]{2}[ ][0-9]{10}$";
        return Pattern.matches(pattern,mobNumber);
    }
    public boolean PassWord(String password)
    {
        String patern = "^[a-zA-Z]{8,}$";
        return Pattern.matches(patern, password);
    }
}
