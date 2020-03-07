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
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue()
    {
        boolean result = validator.MobileNumber("11 1234567890");
        Assert.assertTrue(result);
    }
    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse()
    {
        boolean result = validator.MobileNumber("01 123456789");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue()
    {
        boolean result = validator.PassWord("djjhg53SSSF@jhg");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenInValid_ShouldReturnFalse()
    {
        boolean result = validator.PassWord("abcdeffg");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {
        String array1[]={"abc","abc()*@gmail.com","abc@.com.my","abc123@gmaila",
                "abc123@.com","abc123@.com.com",".abc#$abc.com","abc()*@gm.ail.om",
                "abc@%*.com","abc..2002@gmail.com","abc@.@gmail.com","abc@abc@gmail.com",
                "abc@gmail.com.1a","abc@gmail.com.aa.au"};
        for(int index1=0;index1<array1.length;index1++) {
            boolean Email = validator.EmailId(array1[index1]);
            Assert.assertFalse(Email);
        }
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        String array[]={"abc.xyz@bl.co.in","abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com",
                "abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
                "abc@gmail.com.com","abc+100@gmail.com"};
        for(int index=0;index<array.length;index++){
            boolean email=validator.EmailId(array[index]);
            Assert.assertTrue(email);
        }
    }
}
