import org.junit.Assert;
import org.junit.Test;

public class TestCases
{
    UserRegistration validator = new UserRegistration();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.FirstName("Vaibhav");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse()
    {
        boolean result = validator.FirstName("vaibhaV");
        Assert.assertFalse(result);
    }
}
