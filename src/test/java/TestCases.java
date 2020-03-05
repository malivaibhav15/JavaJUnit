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
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.LastName("Abc");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse()
    {
        boolean result = validator.LastName("abcV");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmailId_WhenValid_ShouldReturnTrue()
    {
        boolean result = validator.EmailId("abc@yahoo.com");
        Assert.assertTrue(result);
    }
    @Test
    public  void givenEmaiId_WhenInValid_ShouldReturnFalse()
    {
        boolean result = validator.EmailId("abc123@.com.com");
        Assert.assertFalse(result);
    }
}
